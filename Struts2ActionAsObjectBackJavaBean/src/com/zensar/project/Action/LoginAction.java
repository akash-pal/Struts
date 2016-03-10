package com.zensar.project.Action;

import com.opensymphony.xwork2.Action;
import com.zensar.bean.UserBean;

public class LoginAction implements Action {

	private UserBean userBean;

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	@Override
	public String execute() throws Exception {
		if (userBean.getUserName().equals("akashpal") && userBean.getPassword().equals("akashpal")) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

}
