package com.Iron_Bank.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

public class ConnectionUtil {

	private  ConnectionUtil() {
		
	}
	public static Connection getConnection(){
		Connection connection = null;
		try {
			DriverManager.registerDriver(new Driver());
			String url = System.getenv("url_db");
			String username = System.getenv("user");
			String password = System.getenv("passwd");
			
			connection = DriverManager.getConnection(url,username,password);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
		
	}
}
