<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>A Basic Validation Example</title>
<link rel="stylesheet" href="mystyle.css" type="text/css" />
</head>
<h3>A Basic Validation Example</h3>
<b>Enter new client details:</b>
<s:form action="addClient">
    <s:textfield label="Name" name="name" />
    <s:textfield label="Age" name="age" />
    <s:textfield label="Nationality" name="nation" />
    <s:submit value="Add Client"/>
</s:form>
| <s:a href="index.jsp">Home</s:a> |
</html>