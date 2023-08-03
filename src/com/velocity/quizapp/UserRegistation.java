package com.velocity.quizapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.Query;
import com.mysql.cj.jdbc.JdbcConnection;

public class UserRegistation {
	Connection con = null;
	PreparedStatement ps = null;
	public void insertUserData(String firstName,String lastName,String userName,String password,String city,String mail,long mobNo) {
	try {
		con =DataConnection.getConnectionDetails();
		String query = "insert into userdata (firstName,lastName,userName,password,city,mail,mobNo)"+"values(?,?,?,?,?,?,?)";
	    ps = con.prepareStatement(query);
		ps.setString(1,firstName);
		ps.setString(2,lastName);
		ps.setString(3,userName);
		ps.setString(4,password);
		ps.setString(5,city);
		ps.setString(6,mail);
		ps.setLong(7,mobNo);
		int i = ps.executeUpdate();
	} catch (Exception e) {
	
	}finally {
		try {
			con.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
	}
		
	}
	public void execute(int input) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<input;i++) {	
			System.out.println("Enter your first name");
			String firstName = sc.next();
			System.out.println("Enter your last name");
			String lastName = sc.next();
			System.out.println("Enter your username");
			String userName = sc.next();
			System.out.println("Enter your password");
			String password =sc.next();
			System.out.println("Enter your city");
			String city = sc.next();
			System.out.println("Enter your Email");
			String mail = sc.next();
			System.out.println("Enter your mobile number");
			long mobNo = sc.nextLong();
			this.insertUserData(firstName, lastName, userName, password, city, mail, mobNo);
		}
		
	}
}
