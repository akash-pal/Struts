package com.zensar.project.Action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.zensar.bean.UserBean;

public class LoginAction implements Action,ModelDriven<UserBean> {

	private UserBean userBean;

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	@Override
	public String execute() throws Exception {
		if (userBean.getUserName().equals("sky") && userBean.getPassword().equals("sky")) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	@Override
	public UserBean getModel() {
		userBean = new UserBean();
		return userBean;
	}

}
