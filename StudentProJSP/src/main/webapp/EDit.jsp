<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.model.Employee"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Employee emp = (Employee) request.getAttribute("mahesh");
		
	%>
	
	
	<form action="Edit" method="post">

		Roll <input type="text" name="roll" value="<%=emp.getRoll()%>">
		<br> Name <input type="text" name="name"
			value="<%=emp.getName()%>"> <br> Campany <input
			type="text" name="campany" value="<%=emp.getCampany()%>"> <br>
		Salary <input type="text" name="salary" value="<%=emp.getSalary()%>">
		<br> <input type="submit" value="save">
	</form>
</body>
</html>