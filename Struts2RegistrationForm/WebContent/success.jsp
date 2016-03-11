<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
	Registration successful
	<br> User Name:
	<s:property value="userName" />
	<br> Email:
	<s:property value="email" />
	<br> Gender:
	<s:property value="gender" />
	<br> Country:
	<s:property value="country" />
	<br> Locations:
	<s:property value="yourlocations" />
	<br> Date:
	<s:property value="selectedDate" />
	<br> 
	Language 1: <s:property value="language1"/> ,Language 2: <s:property value="language2"/>
	<br> 
	File Name : <s:property value="uploadFileFileName"/> 
	<br>
   	Content Type : <s:property value="uploadFileContentType"/>
   	<br>
  	Temp File Name : <s:property value="uploadFile"/>
	
</body>
</html>