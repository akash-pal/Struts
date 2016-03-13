package com.zensar.project.actions;

import com.opensymphony.xwork2.validator.annotations.*;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;

public class LoginAction extends ActionSupport
{
	private String username;
	private String password;
	
	@RequiredFieldValidator(type = ValidatorType.SIMPLE, fieldName = "username",	message = "User Name field is empty.")
	public String getUsername()
	{
		return username;
	}	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	@RequiredFieldValidator(type = ValidatorType.SIMPLE, fieldName = "password",	message = "Password field is empty.")	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String execute()throws Exception 
	{		
		if(username.equals("sa")&&password.equals("helloworld"))
		{
			return SUCCESS;
		}
		else
		{
			addActionError("User name or password is worng");
			return ERROR;
		}
	}    
	
}
   