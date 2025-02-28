package com.raon.advanced;

import java.util.InputMismatchException;

import com.raon.advanced.calculator.Calculator;
import com.raon.advanced.command.CommandConstant;
import com.raon.advanced.command.CommandMapping;
import com.raon.advanced.io.ConsoleReader;
import com.raon.advanced.io.ConsoleWriter;
import com.raon.advanced.io.type.DoubleValidator;
import com.raon.advanced.operator.type.DoubleOperator;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 *
 * 자바 계산기 과제 2단계 구현
 */
public class App {
	// @formatter:off
	private static final ConsoleReader<Double> consoleReader = new ConsoleReader<>(Double::parseDouble, new DoubleValidator());
	private static final ConsoleWriter<Double> consoleWriter = new ConsoleWriter<>();
	private static final Calculator<Double> calculator = new Calculator<>(new DoubleOperator());
	private static final CommandMapping<Double> commandMapping = new CommandMapping<>(consoleWriter, consoleReader, calculator);

	public static void main(String[] args) {
		while (true) {
			try {
				consoleWriter.showCommands();
				CommandConstant commandKey = consoleReader.readCommand();

				commandMapping.get(commandKey).execute();

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
	}
}
