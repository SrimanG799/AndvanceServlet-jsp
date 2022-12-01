<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.model.StudentRegi" %>
    <%@page  import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>

table{
border:solid red;
}
td{
border:solid blue;

}
th{
border:solid red;
background-color:yellow;
}
</style>

</head>
<body>

<h1>Registered Students</h1>
<%
List<StudentRegi> studentRegis=(List<StudentRegi>)request.getAttribute("details");


%>

<table barder="2px">
<tr><th>fname</th><th>sname</th><th>mobile</th><th>email</th><th>gender</th>
<th>skill</th><th>hobbies</th><th>additional</th><th>dob</th><th>Roll</th></tr>

<%
for(StudentRegi a:studentRegis)
{

%>

<tr>

<td><%= a.getFname()%></td>
<td><%= a.getSname()%></td>
<td><%= a.getMobile()%></td>
<td><%= a.getEmail()%></td>
<td><%= a.getGender()%></td>
<td><%= a.getSkill()%></td>
<td><%= a.getHobbies()%></td>
<td><%= a.getDob()%></td>
<td><%= a.getInfo()%></td>
<td><%=a.getRoll() %></td>



</tr>


<%
}
%>
</table>

</body>
</html>