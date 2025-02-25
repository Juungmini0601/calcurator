package com.raon.basic;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 *
 * 자바 계산기 과제 1단계 구현
 */
public class App {

	private static final char ADD = '+';
	private static final char MINUS = '-';
	private static final char MULTIPLY = '*';
	private static final char DIVIDE = '/';

	private static final Set<Character> OPERATORS = Set.of(ADD, MINUS, MULTIPLY, DIVIDE);

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.print("첫 번째 숫자 입력(0 이상의 정수): ");
			int num1 = sc.nextInt();
			validateInputNumber(num1);

			System.out.print("두 번째 숫자 입력(0 이상의 정수): ");
			int num2 = sc.nextInt();
			validateInputNumber(num2);

			System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");

			char operator = sc.next().charAt(0);
			validateInputOperator(operator);

			int result = calculate(num1, num2, operator);
			System.out.printf("%d %c %d = %d\n", num1, operator, num2, result);
		} catch (InputMismatchException | IllegalArgumentException e) {
			System.out.println("입력값을 다시 확인 해주세요!");
		} catch (ArithmeticException e) {
			System.out.println("연산중 예외가 발생 했습니다.");
			System.out.println("원인:" + e.getMessage());
			throw e;
		} catch (Exception e) {
			System.out.println("예상하지 못한 예외가 발생했습니다.");
			throw e;
		}
	}

	// TODO 연산 결과가 오버플로우 되면 어떻게 하나? 일단 PASS (큰 수 연산)
	private static int calculate(int num1, int num2, char operator) {
		return switch (operator) {
			case ADD -> num1 + num2;
			case MINUS -> num1 - num2;
			case MULTIPLY -> num1 * num2;
			case DIVIDE -> num1 / num2;
			default -> throw new IllegalStateException("연산자에 이상한 값이 들어왔습니다.");
		};
	}

	private static void validateInputOperator(char operator) {
		if (!OPERATORS.contains(operator)) {
			throw new IllegalArgumentException("연산자를 정확히 입력 해주세요!");
		}
	}

	private static void validateInputNumber(int num) {
		if (num < 0) {
			System.out.println("0 이상의 정수를 입력 해주세요");
			System.exit(-1);
		}
	}
}
