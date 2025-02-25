package com.raon.advanced;

import java.util.InputMismatchException;

import com.raon.advanced.command.CommandConstant;
import com.raon.advanced.command.CommandMapping;
import com.raon.advanced.io.ConsoleReader;
import com.raon.advanced.io.ConsoleWriter;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 *
 * 자바 계산기 과제 2단계 구현
 */
public class App {

	private static final CommandMapping commandMapping = new CommandMapping();
	private static final ConsoleReader consoleReader = new ConsoleReader();
	private static final ConsoleWriter consoleWriter = new ConsoleWriter();

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
