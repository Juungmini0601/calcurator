package com.raon.advanced.command;

import static com.raon.middle.command.CommandConstant.*;

import java.util.List;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public class Commands {
	private static final List<String> commands = List.of(CALC, REMOVE, EXIT);

	public boolean contains(String command) {
		return commands.contains(command);
	}
}
