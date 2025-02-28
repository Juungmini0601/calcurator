package com.raon.advanced.operator;

import java.util.Map;

import com.raon.advanced.operator.type.NumberOperator;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public class OperatorMapping<T extends Number & Comparable<T>> {

	private final Map<OperatorConstant, Operator<T>> operatorMapping;

	public OperatorMapping(NumberOperator<T> numberOperator) {
		operatorMapping = Map.of(
			// 메소드 참조는 한눈에 잘 안보이는거 같아서 람다로..
			OperatorConstant.ADD, (num1, num2) -> numberOperator.add(num1, num2),
			OperatorConstant.MINUS, (num1, num2) -> numberOperator.minus(num1, num2),
			OperatorConstant.MULTIPLY, (num1, num2) -> numberOperator.multiply(num1, num2),
			OperatorConstant.DIVIDE, (num1, num2) -> numberOperator.divide(num1, num2)
		);
	}

	public Operator<T> get(OperatorConstant operatorKey) {
		return operatorMapping.get(operatorKey);
	}
}
