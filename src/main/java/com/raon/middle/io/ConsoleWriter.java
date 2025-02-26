package com.raon.middle.io;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
// 콘솔 출력
public class ConsoleWriter {

	public void printResult(int num1, int num2, char operator, int result) {
		System.out.printf("%d %c %d = %d\n", num1, operator, num2, result);
	}

	public void showCommands() {
		System.out.println("=============== 명령어 목록 =============");
		System.out.println("1. calc: 계산하기");
		System.out.println("2. remove: 가장 먼저 저장된 데이터 삭제");
		System.out.println("3. exit: 종료");
	}
}
