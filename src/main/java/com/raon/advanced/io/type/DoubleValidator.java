package com.raon.advanced.io.type;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 28.
 */
public class DoubleValidator implements NumberValidator<Double> {
	@Override
	public void validate(Double number) {
		if (number < 0) {
			System.out.println("0 이상의 실수를 입력 해주세요");
			System.exit(-1);
		}
	}
}
