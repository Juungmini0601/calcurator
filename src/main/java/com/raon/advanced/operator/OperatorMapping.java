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
			OperatorConstant.ADD, numberOperator::add,
			OperatorConstant.MINUS, numberOperator::minus,
			OperatorConstant.MULTIPLY, numberOperator::multiply,
			OperatorConstant.DIVIDE, numberOperator::divide
		);
	}

	public Operator<T> get(OperatorConstant operatorKey) {
		return operatorMapping.get(operatorKey);
	}
}
