package com.raon.middle;

import static com.raon.middle.operator.OperatorConstant.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.OptionalInt;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 *
 * 2단계 계산기 구현 클래스
 * 사칙 연산 수행 후 결과값 반환
 * TODO 연산 결과가 오버플로우 되면 어떻게 하나? 일단 PASS (큰 수 연산)
 */
public class Calculator {

	private Deque<Integer> resultHistories = new ArrayDeque<>();

	public int calculate(int num1, int num2, char operator) {
		int result = switch (operator) {
			case ADD -> num1 + num2;
			case MINUS -> num1 - num2;
			case MULTIPLY -> num1 * num2;
			case DIVIDE -> num1 / num2;
			default -> throw new IllegalStateException("연산자에 이상한 값이 들어왔습니다.");
		};

		resultHistories.add(result);
		return result;
	}

	public OptionalInt remove() {
		if (resultHistories.isEmpty()) {
			System.out.println("calculator: no result");
			return OptionalInt.empty();
		}

		return OptionalInt.of(resultHistories.removeLast());
	}
}
