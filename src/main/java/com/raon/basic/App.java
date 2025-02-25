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

			System.out.println("숫자1: " + num1);
			System.out.println("숫자2: " + num2);
			System.out.println("연산자: " + operator);
		} catch (InputMismatchException | IllegalArgumentException e) {
			System.out.println("입력값을 다시 확인 해주세요!");
		} catch (Exception e) {
			System.out.println("예상하지 못한 예외가 발생했습니다.");
			throw e;
		}
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
