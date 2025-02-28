package com.raon.advanced.io;

import java.util.Scanner;
import java.util.function.Function;

import com.raon.advanced.command.CommandConstant;
import com.raon.advanced.io.type.NumberValidator;
import com.raon.advanced.operator.OperatorConstant;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public class ConsoleReader<T extends Number & Comparable<T>> {
	private static final Scanner sc = new Scanner(System.in);
	// 문자열을 받아서 T 타입으로 반환
	private final Function<String, T> converter;
	private final NumberValidator<T> validator;

	public ConsoleReader(Function<String, T> converter, NumberValidator<T> validator) {
		this.converter = converter;
		this.validator = validator;
	}

	public CommandConstant readCommand() {
		System.out.print("명령어 입력: ");
		String commandString = sc.nextLine();

		return CommandConstant.fromKey(commandString);
	}

	public T readNumber() {
		try {
			System.out.print("숫자 입력(0 이상 실수): ");
			T input = converter.apply(sc.nextLine());
			validator.validate(input);

			return input;
		} catch (Exception e) {
			System.out.println("숫자를 입력 해주세요!");
			throw e;
		}
	}

	public OperatorConstant readOperator() {
		System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");

		char operatorKey = sc.next().charAt(0);
		sc.nextLine(); // 버퍼 제거

		return OperatorConstant.fromKey(operatorKey);
	}
}
