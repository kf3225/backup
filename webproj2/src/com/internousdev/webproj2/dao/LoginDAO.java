package com.internousdev.webproj2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.webproj2.util.DBConnector;
import com.opensymphony.xwork2.ActionSupport;

public class LoginDAO extends ActionSupport {
	public String username;
	public String password;

	public boolean select(String username, String password) {
		boolean ret = false;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM users WHERE user_name=? AND password=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				this.username = rs.getString("username");
				this.password = rs.getString("password");

				ret = true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
}