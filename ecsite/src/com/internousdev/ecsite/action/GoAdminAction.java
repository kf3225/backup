package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.GoAdminDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoAdminAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private ArrayList<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();
	private GoAdminDAO goAdminDAO = new GoAdminDAO();

	public String execute() throws SQLException {

		buyItemDTOList = goAdminDAO.updateAdminItem();
		session.put("buyItemList", buyItemDTOList);

		return SUCCESS;
	}
	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
