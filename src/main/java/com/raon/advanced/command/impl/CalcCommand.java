package com.raon.advanced.command.impl;

import com.raon.advanced.calculator.Calculator;
import com.raon.advanced.command.Command;
import com.raon.advanced.io.ConsoleReader;
import com.raon.advanced.io.ConsoleWriter;
import com.raon.advanced.operator.OperatorConstant;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public class CalcCommand<T extends Number & Comparable<T>> implements Command {
	private final ConsoleReader<T> consoleReader;
	private final ConsoleWriter<T> consoleWriter;
	private final Calculator<T> calculator;

	public CalcCommand(ConsoleReader<T> consoleReader, ConsoleWriter<T> consoleWriter, Calculator<T> calculator) {
		this.consoleReader = consoleReader;
		this.consoleWriter = consoleWriter;
		this.calculator = calculator;
	}

	@Override
	public void execute() {
		try {
			T num1 = consoleReader.readNumber();
			T num2 = consoleReader.readNumber();
			OperatorConstant operator = consoleReader.readOperator();

			T result = calculator.calculate(num1, num2, operator);

			consoleWriter.printResult(num1, num2, operator.getKey(), result);
		} catch (ArithmeticException e) {
			System.out.println("연산 중 에러가 발생하였습니다!");
			System.out.println("원인: " + e.getMessage());
		}
	}
}
