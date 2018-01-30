package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	private String loginUserId;
	private String loginPassword;
	public Map<String, Object> session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();
	private BuyItemDAO buyItemDAO = new BuyItemDAO();

	public String execute() {
		String result = ERROR;
		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);
		ArrayList<BuyItemDTO> buyItemDTO = buyItemDAO.getBuyItemInfo();
		session.put("loginUser", loginDTO);

		if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {
			result = SUCCESS;

			session.put("login_user_id", loginDTO.getLoginId());
			session.put("id", "loginComplete");
			session.put("account", loginDTO.getAccount());
			session.put("buyItemList", buyItemDTO);


			return result;
		}else if(((LoginDTO) session.get("loginUser")).getAdmin()) {
			result = "admin";

			session.put("login_user_id", loginDTO.getLoginId());
			session.put("id", "loginComplete");
			session.put("account", loginDTO.getAccount());
			session.put("buyItemList", buyItemDTO);

			return result;
		}
		return result;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
