<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body>
	<h2>
		<s:property value="action1Message" default="Not Set" />
	</h2>
	
	<h2>
		<s:property value="action2Message" default="Not Set" />
	</h2>
	<br>
	<br>Name:
	<s:property value="#request.name" default="Not Set" />
	<br>
	<br>Company:
	<s:property value="#request.company" default="Not Set" />
</body>
</html>
