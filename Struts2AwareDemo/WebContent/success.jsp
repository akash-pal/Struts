<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
	<!-- gets value from valueStack -->
	Welcome <s:property value="userName"/><br>
	<!-- gets value from session of Action context (framework dependent) using OGNL -->
	Hello <s:property value="#session.userBean.userName"/><br>
	<!-- gets value from session of Action context (framework independent) using EL -->
	Hello  ${sessionScope.userBean.userName} 
</body>
</html>