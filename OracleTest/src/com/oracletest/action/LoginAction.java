package com.oracletest.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.oracletest.dao.LoginDAO;
import com.oracletest.dto.LoginDTO;

public class LoginAction extends ActionSupport {
	private String userId;
	private String password;
	private List<String> errorMessageList = new ArrayList<String>();
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();

	public String execute() throws SQLException {
		String result=ERROR;
		loginDTO = loginDAO.getUserInfo(userId, password);

		if(userId.equals(loginDTO.getUserId()) && password.equals(loginDTO.getPassword())) {
			result = SUCCESS;
		}else if(!userId.equals(loginDTO.getUserId()) || !password.equals(loginDTO.getPassword())) {
			errorMessageList.add("ユーザー情報を間違えています");
			result = ERROR;
		}
		return result;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getErrorMessageList() {
		return errorMessageList;
	}

	public void setErrorMessageList(List<String> errorMessageList) {
		this.errorMessageList = errorMessageList;
	}
}
