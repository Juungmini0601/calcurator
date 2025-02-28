package com.raon.advanced.command.impl;

import java.util.List;

import com.raon.advanced.Calculator;
import com.raon.advanced.command.Command;
import com.raon.advanced.io.ConsoleReader;
import com.raon.advanced.io.ConsoleWriter;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public class ListGraterThanCommand<T extends Number & Comparable<T>> implements Command {
	private final Calculator<T> calculator;
	private final ConsoleReader<T> consoleReader;
	private final ConsoleWriter<T> consoleWriter;

	public ListGraterThanCommand(Calculator<T> calculator, ConsoleReader<T> consoleReader,
		ConsoleWriter<T> consoleWriter) {
		this.calculator = calculator;
		this.consoleReader = consoleReader;
		this.consoleWriter = consoleWriter;
	}

	@Override
	public void execute() {
		T value = consoleReader.readNumber();
		List<T> results = calculator.getGreatherThanList(value);

		consoleWriter.printGreatherThanList(value, results);
	}
}
