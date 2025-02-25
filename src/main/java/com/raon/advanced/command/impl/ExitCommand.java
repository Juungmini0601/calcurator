package com.raon.advanced.command.impl;

import com.raon.advanced.command.Command;

/**
 * @author    : kimjungmin
 * Created on : 2025. 2. 25.
 */
public class ExitCommand implements Command {
	@Override
	public void execute() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}
