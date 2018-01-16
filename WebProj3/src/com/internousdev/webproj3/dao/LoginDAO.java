package com.internousdev.webproj3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.webproj3.dto.LoginDTO;
import com.internousdev.webproj3.util.DBConnector;

public class LoginDAO {
	public String username;
	public String password;

	public LoginDTO select(String username, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		LoginDTO dto = new LoginDTO();

		String sql = "SELECT * FROM users WHERE username=? AND password=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				dto.setUsername(rs.getString("user_name"));
				dto.setUsername(rs.getString("password"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}

		return dto;
	}
}