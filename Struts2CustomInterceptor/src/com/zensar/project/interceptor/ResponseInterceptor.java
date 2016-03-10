package com.zensar.project.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
public class ResponseInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation ref) throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		
		response.addHeader("Access-Control-Allow-Origin","*");
		response.addHeader("Access-Control-Allow-Methods","GET,POST,DELETE,PUT");
		response.addHeader("Access-Control-Allow-Headers","X-Requested-With,Content-Type,X-Codingpedia");
		
		return ref.invoke();
	}

}
