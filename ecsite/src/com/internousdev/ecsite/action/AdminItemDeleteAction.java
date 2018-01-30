package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.AdminItemDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminItemDeleteAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private String delete;
	private String message;
	public AdminItemDeleteDAO adminItemDeleteDAO = new AdminItemDeleteDAO();

	public String execute() throws SQLException {
		String result = SUCCESS;

		String item_id = delete;
		int res = adminItemDeleteDAO.itemDelete(item_id);

		if(res > 0) {
			setMessage("削除に成功しました");
		}else {
			setMessage("削除に失敗しました");
		}


		return result;
	}

	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
