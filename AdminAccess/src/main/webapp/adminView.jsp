<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List" %>
    <%@page import="com.model.AddRole" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table{
border:solid blue;
}
td{
border:solid blue;

}
th{
border:solid blue;
background-color:red;
</style>
</head>
<body>
<h1>AdminView</h1>
<% 
List<AddRole> addRole=(List<AddRole>)request.getAttribute("details");
%>

<%
String s=(String)request.getAttribute("message");
if(s!=null)
{
	out.print("successfully updated");
}
%>
<table barder="2px">
<tr><th>empid</th><th>fname</th><th>sname</th><th>password</th><th>email</th><th>role</th><th colspan="2">Control</tr>

<%
for(AddRole a:addRole)
{

%>

<tr>

<td><%= a.getEmpid()%></td>
<td><%= a.getFname()%></td>
<td><%= a.getSname()%></td>
<td><%= a.getPassword()%></td>
<td><%= a.getEmail()%></td>
<td><%= a.getRole()%></td>

<td><a href="AdminUpdate?sriman=<%= a.getEmpid() %>">Update</a></td>
<td><a href="delete?sriman=<%= a.getEmpid() %>">Delete</a></td>


</tr>


<%
}
%>
</table>


</body>
</html>