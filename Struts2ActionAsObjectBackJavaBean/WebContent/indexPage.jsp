<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ActionAsObjectBackJavaBean</title>
</head>
<body>
	<s:form method="post" action="login">
		<s:textfield name="userBean.userName" label="Enter user name"></s:textfield>	
		<s:password name="userBean.password" label="Enter password"></s:password>
		<s:submit value="Login"></s:submit>
	</s:form>
</body>
</html>