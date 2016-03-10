package com.zensar.project.actions;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.Action;

public class Action2 implements Action, ServletRequestAware {
	private HttpServletRequest request;
	String action2Message;

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public String getAction2Message() {
		return action2Message;
	}

	public void setAction2Message(String action2Message) {
		this.action2Message = action2Message;
	}

	public String execute() throws Exception {
		setAction2Message("Welcome From Action 2");
		request.setAttribute("company", "Zensar Tech. ltd");
		return SUCCESS;
	}
}
