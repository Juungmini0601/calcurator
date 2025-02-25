package com.raon.advanced.command;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public enum CommandConstant {
	CALC("calc"),
	REMOVE("remove"),
	LIST_GREATER_THAN("list greater than"),
	EXIT("exit");

	private final String key;

	CommandConstant(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	// 문자열을통해서 Enum생성
	public static CommandConstant fromKey(String key) {
		for (CommandConstant command : CommandConstant.values()) {
			if (command.getKey().equalsIgnoreCase(key)) {
				return command;
			}
		}

		throw new IllegalArgumentException("유효 하지 않은 명령어 입니다.");
	}
}
