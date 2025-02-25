package com.raon.advanced.command;

import java.util.Map;

import com.raon.advanced.Calculator;
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
public class CommandMapping {

	private static final ConsoleReader consoleReader = new ConsoleReader();
	private static final ConsoleWriter consoleWriter = new ConsoleWriter();
	private static final Calculator<Double> calculator = new Calculator<>();

	private final Map<CommandConstant, Command> commandMapping = Map.of(
		CommandConstant.CALC, new CalcCommand(consoleReader, consoleWriter, calculator),
		CommandConstant.REMOVE, new RemoveCommand(calculator),
		CommandConstant.LIST_GREATER_THAN, new ListGraterThanCommand(calculator, consoleReader, consoleWriter),
		CommandConstant.EXIT, new ExitCommand()
	);

	public Command get(CommandConstant command) {
		return commandMapping.get(command);
	}
}
