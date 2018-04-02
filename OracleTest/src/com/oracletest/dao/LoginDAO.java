package com.oracletest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.oracletest.dto.LoginDTO;
import com.oracletest.util.DBConnector;

public class LoginDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	public LoginDTO getUserInfo(String userId, String password) throws SQLException {
		LoginDTO loginDTO = new LoginDTO();
		String sql = "SELECT user_id, password FROM user_info WHERE user_id=? AND password=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				loginDTO.setUserId(resultSet.getString("user_id"));
				loginDTO.setPassword(resultSet.getString("password"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}

		return loginDTO;
	}
}
