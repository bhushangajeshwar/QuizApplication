package com.velocity.quizapp;

import java.util.Scanner;

public class Registatiomimpl implements Registation{

	@Override
	public void DisplayRegistation() {
		System.out.println("Enter your first name");
		Scanner scanner = new Scanner(System.in);
		String firsttName = scanner.next();
		System.out.println("Enter your last name");
		Scanner scanner2 = new Scanner(System.in);
		String lastName = scanner2.next();
		System.out.println("Enter your username");
		Scanner scanner3 = new Scanner(System.in);
		String username = scanner3.next();
		System.out.println("Enter your password");
		Scanner scanner4 = new Scanner(System.in);
		String password =scanner4.next();
		System.out.println("Enter your city");
		Scanner scanner5 = new Scanner(System.in);
		String city = scanner5.next();
		System.out.println("Enter your Email");
		Scanner scanner6 = new Scanner(System.in);
		String mail = scanner6.next();
		System.out.println("Enter your mobile number");
		Scanner scanner7 = new Scanner(System.in);
		long mobileno = scanner7.nextLong();
		
		
	}

}
