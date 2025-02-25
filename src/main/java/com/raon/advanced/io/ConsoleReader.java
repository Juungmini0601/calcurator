package com.raon.advanced.io;

import java.util.Scanner;

import com.raon.advanced.command.CommandConstant;
import com.raon.advanced.operator.OperatorConstant;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public class ConsoleReader {

	private static final Scanner sc = new Scanner(System.in);

	private static class Validator {
		private static void validateInputNumber(double num) {
			if (num < 0) {
				System.out.println("0 이상의 실수를 입력 해주세요");
				System.exit(-1);
			}
		}
	}

	public CommandConstant readCommand() {
		System.out.print("명령어 입력: ");
		String commandString = sc.nextLine();

		return CommandConstant.fromKey(commandString);
	}

	public double readDouble() {
		System.out.print("숫자 입력(0 이상의 실수): ");
		double num1 = sc.nextDouble();
		sc.nextLine(); // 버퍼 제거

		Validator.validateInputNumber(num1);

		return num1;
	}

	public OperatorConstant readOperator() {
		System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");

		char operatorKey = sc.next().charAt(0);
		sc.nextLine(); // 버퍼 제거
		
		return OperatorConstant.fromKey(operatorKey);
	}
}
