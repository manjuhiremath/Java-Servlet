
<%@page import="com.javaDemo.web.model.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h2>Hello World!</h2>
<form action="getStudent">
		<input type="text" name="sid">
		<input type="submit">
	</form>
	<div>
	<%
	Student s = (Student)session.getAttribute("student");
		out.println(s);
	%>
	
	</div>
</body>
</html>
