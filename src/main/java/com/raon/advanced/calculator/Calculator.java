package com.raon.advanced.calculator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Optional;

import com.raon.advanced.operator.Operator;
import com.raon.advanced.operator.OperatorConstant;
import com.raon.advanced.operator.OperatorMapping;
import com.raon.advanced.operator.type.NumberOperator;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 * 2단계 계산기 구현 클래스
 * 사칙 연산 수행 후 결과값 반환
 */
public class Calculator<T extends Number & Comparable<T>> {

	private final Deque<T> resultHistories = new ArrayDeque<>();

	private final OperatorMapping<T> operatorMapping;

	public Calculator(NumberOperator<T> numberOperator) {
		this.operatorMapping = new OperatorMapping<>(numberOperator);
	}

	public T calculate(T num1, T num2, OperatorConstant operatorKey) {
		Operator<T> operator = operatorMapping.get(operatorKey);
		T result = operator.execute(num1, num2);

		resultHistories.add(result);
		return result;
	}

	public Optional<T> remove() {
		if (resultHistories.isEmpty()) {
			System.out.println("calculator: no result");
			return Optional.empty();
		}

		return Optional.of(resultHistories.removeLast());
	}

	public List<T> getGreatherThanList(T value) {
		return resultHistories.stream()
			.filter(x -> x.compareTo(value) > 0)
			.toList();
	}
}
