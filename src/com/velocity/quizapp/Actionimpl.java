package com.velocity.quizapp;

import java.util.Scanner;

public class Actionimpl implements Action{

	@Override
	public void quiz() {
		System.out.println("Welcome to Quiz based Application\n\n1. Student Registation \n2. Student Login \n3. Display the list of questions \n4. Store quiz result into database \n5. Display Quiz result");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
		UserRegistation ur = new UserRegistation();
		ur.execute(7);
			break;
	    case 2:
			Loginimpl loginimpl = new Loginimpl();
			loginimpl.displayLogin();
			break;
	    case 3:
			
			break;
	    case 4:
			
			break;
	    case 5:
			
			break;

		default:
			System.out.println("Invalid Input");
			break;
		
		}
	}
	public static void main(String[] args) {
		Actionimpl a = new Actionimpl();
		a.quiz();
	}

}
