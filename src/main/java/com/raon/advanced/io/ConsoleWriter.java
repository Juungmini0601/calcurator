package com.raon.advanced.io;

import java.util.List;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public class ConsoleWriter<T extends Number & Comparable<T>> {

	public void printResult(T num1, T num2, char operator, T result) {
		System.out.printf("%s %c %s = %s\n", num1, operator, num2, result);
	}

	public void printGreatherThanList(T x, List<T> list) {
		System.out.println(x + " 보다 큰 수: " + list);
	}

	public void showCommands() {
		System.out.println("=============== 명령어 목록 =============");
		System.out.println("1. calc: 계산하기");
		System.out.println("2. remove: 가장 먼저 저장된 데이터 삭제");
		System.out.println("3. list greater than(숫자 입력 X): 입력 값 보다 큰 수 조회");
		System.out.println("4. exit: 종료");
	}
}
