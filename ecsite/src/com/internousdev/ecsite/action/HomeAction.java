package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	public String execute() {
		String result = "login";
		if(session.containsKey("id") && session.get("account").toString().equals("user")) {
			BuyItemDAO buyItemDAO = new BuyItemDAO();
			ArrayList<BuyItemDTO> buyItemDTO = buyItemDAO.getBuyItemInfo();

			session.put("buyItemList", buyItemDTO);

			result = SUCCESS;

		}else if(session.containsKey("id") && session.get("account").toString().equals("admin")) {
			BuyItemDAO buyItemDAO = new BuyItemDAO();
			ArrayList<BuyItemDTO> buyItemDTO = buyItemDAO.getBuyItemInfo();

			session.put("buyItemList", buyItemDTO);
			result = "admin";
		}
		return result;
	}


	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
