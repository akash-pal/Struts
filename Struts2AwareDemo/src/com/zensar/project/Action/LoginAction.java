package com.zensar.project.Action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.zensar.bean.UserBean;

public class LoginAction implements Action, ModelDriven<UserBean>, SessionAware {

	private UserBean userBean;
	private Map<String,UserBean> map;

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	/*
	 * (non-Javadoc)
	 * @see com.opensymphony.xwork2.Action#execute()
	 */
	@Override
	public String execute() throws Exception {
		if (userBean.getUserName().equals("sky")&& userBean.getPassword().equals("sky")) {
			map.put("userBean",userBean);
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public UserBean getModel() {
		userBean = new UserBean();
		return userBean;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 * 
	 */
	@Override
	public void setSession(Map map) {
		this.map = map;

	}

}
