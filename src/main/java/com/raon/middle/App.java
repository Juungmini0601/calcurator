package com.raon.middle;

import static com.raon.middle.command.CommandConstant.*;

import java.util.InputMismatchException;

import com.raon.middle.io.ConsoleReader;
import com.raon.middle.io.ConsoleWriter;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 *
 * 자바 계산기 과제 2단계 구현
 */
public class App {

	private static final Calculator calculator = new Calculator();
	private static final ConsoleReader consoleReader = new ConsoleReader();
	private static final ConsoleWriter consoleWriter = new ConsoleWriter();

	public static void main(String[] args) {
		while (true) {
			try {
				int num1 = consoleReader.readInt();
				int num2 = consoleReader.readInt();
				char operator = consoleReader.readOperator();

				int result = calculator.calculate(num1, num2, operator);

				consoleWriter.printResult(num1, num2, operator, result);
				consoleWriter.showCommands();

				String command = consoleReader.readCommand();

				// TODO 조금 더 좋은 방법이 있을 거 같음
				if (CALC.equalsIgnoreCase(command)) {
					continue;
				}

				if (REMOVE.equalsIgnoreCase(command)) {
					calculator.remove()
						.ifPresent(removeValue -> System.out.println("removed Value: " + removeValue));
					continue;
				}

				if (EXIT.equalsIgnoreCase(command)) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}

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
