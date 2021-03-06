package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemSelectDAO;
import com.internousdev.ecsite.dao.ItemSelectDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemSelectAction extends ActionSupport implements SessionAware {
	Map<String, Object> session;
	private String itemId;
	private ItemSelectDAO itemSelectDAO = new ItemSelectDAO();
	private ItemSelectDTO itemSelectDTO = new ItemSelectDTO();

	public String execute() throws SQLException {
		int item_id = Integer.parseInt(itemId);
		itemSelectDTO = itemSelectDAO.getItemSelectInfo(item_id);
		session.put("id", itemSelectDTO.getId().toString());
		session.put("itemName", itemSelectDTO.getItemName().toString());
		session.put("itemPrice", itemSelectDTO.getItemPrice().toString());


		return SUCCESS;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
