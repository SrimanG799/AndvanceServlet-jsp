<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@page import="com.model.AddRole"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
image{
width:80px;
height: 80px;

}
</style>
</head>
<body>
<h1>welcome employee</h1>
<%
AddRole addRole=(AddRole)request.getAttribute("addrole");
%>

<image src="C:\Users\srima\Downloads\emplo.png"></image><br>
<br>
<%= "Roll =["+addRole.getRole()+"] "+"name="+addRole.getFname()+" "+addRole.getSname()%>
<br><br>
<a href="register.html">Register</a>
<br>
<a href="empgetdetails">GetDetails</a><br>
<a href="Empprofile?sriman=<%= addRole.getEmpid() %>">Profile</a>


</body>
</html>