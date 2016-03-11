<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Registration</title>
<s:head theme="ajax" />
</head>
<body>

	<s:form method="post" action="resultAction" enctype="multipart/form-data">
	
		<s:textfield name="userName" label="Enter name"></s:textfield>
		<s:textfield name="email" label="Enter email"></s:textfield>
		<s:password name="password" label="Enter password"></s:password>
		
		<s:datetimepicker label="Date of Birth" name="selectedDate"
			displayFormat="MM-dd-yy"  />
		
		<s:radio list="{'Male','Female'}" name="gender" label="Gender"></s:radio>
		
		<s:select list="{'india','usa','uk'}" name="country" label="Country"></s:select>
		
		<s:checkboxlist list="locations" label="Locations"
			name="yourlocations"></s:checkboxlist>
		<s:autocompleter list="states" label="State" />

		<s:doubleselect label="Language" name="language1"
			list="languageMap.keySet()" doubleName="language2"
			doubleList="languageMap.get(top)" />
			
		<s:file name="uploadFile" label="Upload File" size="40" />

		<s:submit value="SignUp" name="submit"></s:submit>
	</s:form>
</body>
</html>