package com.velocity.quizapp;

import java.util.Scanner;

public class Loginimpl implements Login {

	@Override
	public void DisplayLogin() {
		System.out.println("Enter your username");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		System.out.println("Enter your password");
		Scanner scanner2 = new Scanner(System.in);
		String password = scanner2.next();

	}

}
