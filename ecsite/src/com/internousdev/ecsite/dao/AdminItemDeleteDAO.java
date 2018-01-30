package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class AdminItemDeleteDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();



	public int itemDelete(String item_id) throws SQLException {
		String sql = "DELETE FROM item_info_transaction WHERE id = ?";
		int result = 0;
		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, item_id);
			result = preparedStatement.executeUpdate();

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return result;
	}
}
