<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
out.print("EmployeeDetails");



%>

<%
List<Employee> empt=(List<Employee>)request.getAttribute("empdet");
%>


<table border=2px>;
<tr>
<th>Roll</th><th>Name</th><th>Campany</th><th>salary</th>
</tr>
<% 
for(Employee e:empt){
	%>


<tr>

<td><%= e.getRoll()%></td>
<td><%=e.getName()%></td>
<td><%=e.getCampany()%></td>
<td><%=e.getSalary() %></td>
<td><a href="Edit?sriman=<%= e.getRoll() %>">Edit</a></td>
<td><a href="delete?sriman=<%= e.getRoll() %>">Delete</a></td>

</tr>

	
	
<% 	
	
}
%>
<a href="Index.jsp">Home</a>




</body>
</html>