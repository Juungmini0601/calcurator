package com.raon.advanced.operator.type;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 28.
 */
public interface NumberOperator<T extends Number> {
	T add(T num1, T num2);

	T minus(T num1, T num2);

	T multiply(T num1, T num2);

	T divide(T num1, T num2);
}
