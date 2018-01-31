package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;



public class ItemSelectDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private ItemSelectDTO itemSelectDTO = new ItemSelectDTO();


	public ItemSelectDTO getItemSelectInfo(int item_id) throws SQLException {
		String sql = "SELECT * FROM item_info_transaction WHERE id = ?";
		ItemSelectDTO itemSelectDTO = new ItemSelectDTO();
		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, item_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				itemSelectDTO.setId(resultSet.getString("id"));
				itemSelectDTO.setItemName(resultSet.getString("item_name"));
				itemSelectDTO.setItemPrice(resultSet.getString("item_price"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return itemSelectDTO;
	}
}
