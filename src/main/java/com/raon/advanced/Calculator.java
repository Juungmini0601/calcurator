package com.raon.advanced;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Optional;

import com.raon.advanced.operator.Operator;
import com.raon.advanced.operator.OperatorConstant;
import com.raon.advanced.operator.OperatorMapping;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 *
 * 2단계 계산기 구현 클래스
 * 사칙 연산 수행 후 결과값 반환
 * TODO 연산 결과가 오버플로우 되면 어떻게 하나? 일단 PASS (큰 수 연산)
 */
public class Calculator<T extends Double> {

	private final Deque<Double> resultHistories = new ArrayDeque<>();
	private final OperatorMapping<T> operatorMapping = new OperatorMapping<>();

	public Double calculate(T num1, T num2, OperatorConstant operatorKey) {
		// TODO 여기도 지금 Double로 땜빵 되어 있음.
		Operator<Double> operator = operatorMapping.get(operatorKey);
		Double result = operator.execute(num1, num2);

		resultHistories.add(result);
		return result;
	}

	public Optional<Double> remove() {
		if (resultHistories.isEmpty()) {
			System.out.println("calculator: no result");
			return Optional.empty();
		}

		return Optional.of(resultHistories.removeLast());
	}

	public List<Double> getGreatherThanList(double value) {
		return resultHistories.stream()
			.filter(x -> x > value)
			.toList();
	}
}
