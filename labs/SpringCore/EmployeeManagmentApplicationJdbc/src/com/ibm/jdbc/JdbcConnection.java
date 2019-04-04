package com.ibm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	private static Connection connection = null;
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeapp", "root", "");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection(){
		//System.out.println("Getting connection object "+connection);
		return connection;
	}
}
