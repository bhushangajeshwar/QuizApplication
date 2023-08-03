package com.velocity.quizapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataConnection {
	static Connection connection = null;
	public static Connection getConnectionDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapplication","root","root");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
		
	}

}
