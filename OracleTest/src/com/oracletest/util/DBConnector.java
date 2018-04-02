package com.oracletest.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private String url="jdbc:oracle:thin:@localhost:1521:orcl";
	private String driverName="oracle.jdbc.driver.OracleDriver";
	private String user="testuser";
	private String password="testuser";

	public Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName(driverName);
			conn=(Connection) DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

}
