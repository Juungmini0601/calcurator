package com.raon.advanced.command.impl;

import com.raon.advanced.Calculator;
import com.raon.advanced.command.Command;
import com.raon.advanced.io.ConsoleReader;
import com.raon.advanced.io.ConsoleWriter;
import com.raon.advanced.operator.OperatorConstant;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public class CalcCommand implements Command {
	private final ConsoleReader consoleReader;
	private final ConsoleWriter consoleWriter;
	private final Calculator<Double> calculator;

	public CalcCommand(ConsoleReader consoleReader, ConsoleWriter consoleWriter, Calculator<Double> calculator) {
		this.consoleReader = consoleReader;
		this.consoleWriter = consoleWriter;
		this.calculator = calculator;
	}

	@Override
	public void execute() {
		try {
			double num1 = consoleReader.readDouble();
			double num2 = consoleReader.readDouble();
			OperatorConstant operator = consoleReader.readOperator();

			double result = calculator.calculate(num1, num2, operator);

			consoleWriter.printResult(num1, num2, operator.getKey(), result);
		} catch (ArithmeticException e) {
			System.out.println("연산 중 에러가 발생하였습니다!");
			System.out.println("원인: " + e.getMessage());
		}

	}
}
