package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dao.ItemInsertCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemInsertConfirmAction extends ActionSupport {

	private String itemName;
	private String itemPrice;
	private String stockCount;
	private String errorMessage;
	public ArrayList<String> itemInsertList = new ArrayList<String>();
	private ItemInsertCompleteDAO itemInsertCompleteDAO = new ItemInsertCompleteDAO();

	public String execute() throws SQLException {
		String result = SUCCESS;

		itemInsertList.add(itemName);
		itemInsertList.add(itemPrice);
		itemInsertList.add(stockCount);

		if(!(itemInsertList.isEmpty())) {
		itemInsertCompleteDAO.getItemInfo(
				itemInsertList.get(0),
				itemInsertList.get(1),
				itemInsertList.get(2));

		}else {
			setErrorMessage("未入力の項目があります");
			result = ERROR;
		}
		return result;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getStockCount() {
		return stockCount;
	}

	public void setStockCount(String stockCount) {
		this.stockCount = stockCount;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
