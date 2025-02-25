package com.raon.advanced.command;

import java.util.List;

import com.raon.advanced.Calculator;
import com.raon.advanced.io.ConsoleReader;
import com.raon.advanced.io.ConsoleWriter;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public class ListGraterThanCommand implements Command {
	private final Calculator<Double> calculator;
	private final ConsoleReader consoleReader;
	private final ConsoleWriter consoleWriter;

	public ListGraterThanCommand(Calculator<Double> calculator, ConsoleReader consoleReader,
		ConsoleWriter consoleWriter) {
		this.calculator = calculator;
		this.consoleReader = consoleReader;
		this.consoleWriter = consoleWriter;
	}

	@Override
	public void execute() {
		double value = consoleReader.readDouble();
		List<Double> results = calculator.getGreatherThanList(value);

		consoleWriter.printGreatherThanList(value, results);
	}
}
