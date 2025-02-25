package com.raon.middle.operator;

import static com.raon.middle.operator.OperatorConstant.*;

import java.util.Set;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public class Operators {
	private static final Set<Character> OPERATORS = Set.of(ADD, MINUS, MULTIPLY, DIVIDE);

	public boolean contains(char operator) {
		return OPERATORS.contains(operator);
	}
}
