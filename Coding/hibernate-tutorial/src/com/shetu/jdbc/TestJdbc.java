package com.shetu.jdbc;
import java.sql.DriverManager;

public class TestJdbc {
	public static void main(String[] args) {

		// declare: databaseName, hostName, port, JdbcUrl, username, password
		String host = "localhost";
		String dbName = "hb_student_tracker";
		String port = "3306";
		String jdbcUrl = "jdbc:mysql://" + host + ":" + port + "/" + dbName + "?useSSL=false";
		String userName = "hbstudent";
		String password = "hbstudent";
		// inside try catch call the DriverManager.getConnection() method
		try {
				System.out.println("Connecting to : "+jdbcUrl);
				DriverManager.getConnection(jdbcUrl,userName,password);
				System.out.println("Connected Successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
