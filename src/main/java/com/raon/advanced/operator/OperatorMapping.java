package com.raon.advanced.operator;

import java.util.Map;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 *
 * TODO 여기 제네릭 적용이 너무 어렵다.. 일단 Double로 땜빵
 */
public class OperatorMapping<T extends Double> {
	private final Map<OperatorConstant, Operator<Double>> operatorMapping = Map.of(
		OperatorConstant.ADD, (num1, num2) -> num1 + num2,
		OperatorConstant.MINUS, (num1, num2) -> num1 - num2,
		OperatorConstant.MULTIPLY, (num1, num2) -> num1 * num2,
		OperatorConstant.DIVIDE, (num1, num2) -> num1 / num2
	);

	public Operator<Double> get(OperatorConstant operatorKey) {
		return operatorMapping.get(operatorKey);
	}
}
