package com.raon.advanced.command.impl;

import com.raon.advanced.Calculator;
import com.raon.advanced.command.Command;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public class RemoveCommand<T extends Number & Comparable<T>> implements Command {
	private final Calculator<T> calculator;

	public RemoveCommand(Calculator<T> calculator) {
		this.calculator = calculator;
	}

	@Override
	public void execute() {
		calculator.remove()
			.ifPresent(removeValue -> System.out.println("removed Value: " + removeValue));
	}
}
