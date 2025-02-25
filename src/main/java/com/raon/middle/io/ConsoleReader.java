package com.raon.middle.io;

import java.util.Scanner;

import com.raon.middle.command.Commands;
import com.raon.middle.operator.Operators;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public class ConsoleReader {

	private static final Scanner sc = new Scanner(System.in);

	private static class Validator {
		private static final Operators operators = new Operators();
		private static final Commands commands = new Commands();

		private static void validateInputNumber(int num) {
			if (num < 0) {
				System.out.println("0 이상의 정수를 입력 해주세요");
				System.exit(-1);
			}
		}

		private static void validateInputOperator(char operator) {
			if (!operators.contains(operator)) {
				throw new IllegalArgumentException("연산자를 정확히 입력 해주세요!");
			}
		}

		private static void validateCommand(String command) {
			if (!commands.contains(command)) {
				throw new IllegalArgumentException("올바른 명령어가 아닙니다.");
			}
		}
	}

	public String readCommand() {
		try {
			System.out.print("명령어 입력: ");
			String command = sc.next();

			Validator.validateCommand(command);

			return command;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public int readInt() {
		System.out.print("숫자 입력(0 이상의 정수): ");
		int num1 = sc.nextInt();

		Validator.validateInputNumber(num1);

		return num1;
	}

	public char readOperator() {
		System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");

		char operator = sc.next().charAt(0);
		Validator.validateInputOperator(operator);

		return operator;
	}
}
