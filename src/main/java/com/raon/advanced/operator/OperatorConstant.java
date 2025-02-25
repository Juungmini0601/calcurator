package com.raon.advanced.operator;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public enum OperatorConstant {
	ADD('+'),
	MINUS('-'),
	MULTIPLY('*'),
	DIVIDE('/');

	private final char Key;

	OperatorConstant(char Key) {
		this.Key = Key;
	}

	public char getKey() {
		return Key;
	}

	// 연산자와 문자 비교를 쉽게 하기 위한 메서드
	public static OperatorConstant fromKey(char key) {
		for (OperatorConstant operator : values()) {
			if (operator.Key == key) {
				return operator;
			}
		}

		throw new IllegalArgumentException("유효하지 않은 연산자: " + key);
	}
}

