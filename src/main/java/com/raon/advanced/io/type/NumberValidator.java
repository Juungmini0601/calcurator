package com.raon.advanced.io.type;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 28.
 */
public interface NumberValidator<T extends Number & Comparable<T>> {
	void validate(T number);
}
