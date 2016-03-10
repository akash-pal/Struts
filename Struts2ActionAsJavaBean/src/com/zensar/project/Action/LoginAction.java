package com.zensar.project.Action;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {

	private String userName, password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {

		if(userName.equals("akash") && password.equals("akash")){
			return SUCCESS;
		}
		else{
			return ERROR;
		}
		
	}

}
