<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.model.AddRole" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AddRole add=(AddRole)request.getAttribute("add");
%>

<div align="center">
<form action="AdminUpdate" method="post" >
<label for="empid">empid</label><br>
<input type="text" name="empid" value="<%= add.getEmpid()%>"  ><br>
<label for="fname">fname</label><br>
<input type="text" name="fname" value="<%=add.getFname()%>"><br>
<label for="sname">sname</label><br>
<input type="text" name="sname" value="<%=add.getSname()%>"><br>
<label for="password">password</label><br>
<input type="password" name="password" value="<%=add.getPassword() %>"><br>

<label for="email">email</label><br>
<input type="email" name="email" value="<%=add.getEmail() %>"><br>
<label for="role">role</label><br>
<input type="role" name="role" value="<%=add.getRole() %>"><br><br>
<input type="submit" value="update">
<input type="reset" value="clear">


</form>
</div>
 
 

</body>
</html>