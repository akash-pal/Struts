package com.zensar.project.actions;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.Action;

public class Action1 implements Action, ServletRequestAware {
	private HttpServletRequest request;
	String action1Message;

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public String getAction1Message() {
		return action1Message;
	}

	public void setAction1Message(String action1Message) {
		this.action1Message = action1Message;
	}

	public String execute() throws Exception {
		setAction1Message("Welcome from Action 1 ");
		request.setAttribute("name", "Satish Mahajan");
		return SUCCESS;
	}
}
