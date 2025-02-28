package com.raon.advanced.command;

import java.util.Map;

import com.raon.advanced.calculator.Calculator;
import com.raon.advanced.command.impl.CalcCommand;
import com.raon.advanced.command.impl.ExitCommand;
import com.raon.advanced.command.impl.ListGraterThanCommand;
import com.raon.advanced.command.impl.RemoveCommand;
import com.raon.advanced.io.ConsoleReader;
import com.raon.advanced.io.ConsoleWriter;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public class CommandMapping<T extends Number & Comparable<T>> {

	private final Map<CommandConstant, Command> commandMapping;

	public CommandMapping(ConsoleWriter<T> consoleWriter, ConsoleReader<T> consoleReader, Calculator<T> calculator) {
		commandMapping = Map.of(
			CommandConstant.CALC, new CalcCommand<>(consoleReader, consoleWriter, calculator),
			CommandConstant.REMOVE, new RemoveCommand<>(calculator),
			CommandConstant.LIST_GREATER_THAN, new ListGraterThanCommand<>(calculator, consoleReader, consoleWriter),
			CommandConstant.EXIT, new ExitCommand()
		);
	}

	public Command get(CommandConstant command) {
		return commandMapping.get(command);
	}
}
