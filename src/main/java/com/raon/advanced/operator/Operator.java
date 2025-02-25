package com.raon.advanced.operator;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
@FunctionalInterface
public interface Operator<T extends Double> {
	T execute(T num1, T num2);
}
