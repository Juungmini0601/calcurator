package com.raon.advanced.command;

import com.raon.advanced.Calculator;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public class RemoveCommand implements Command {
	private final Calculator<Double> calculator;

	public RemoveCommand(Calculator<Double> calculator) {
		this.calculator = calculator;
	}

	@Override
	public void execute() {
		calculator.remove()
			.ifPresent(removeValue -> System.out.println("removed Value: " + removeValue));
	}
}
