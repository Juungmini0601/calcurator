package com.raon.basic;

import java.util.Scanner;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 *
 * 자바 계산기 과제 1단계 구현
 */
public class App {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("첫 번째 숫자 입력(0 이상의 정수): ");
		int num1 = sc.nextInt();
		validate(num1);

		System.out.print("두 번째 숫자 입력(0 이상의 정수): ");
		int num2 = sc.nextInt();
		validate(num2);

		System.out.println("숫자1: " + num1);
		System.out.println("숫자2: " + num2);
	}

	public static void validate(int num) {
		if (num < 0) {
			System.out.println("0 이상의 정수를 입력 해주세요");
			System.exit(-1);
		}
	}
}
