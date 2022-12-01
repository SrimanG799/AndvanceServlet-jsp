<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response</title>
</head>
<body>
<% String fn=request.getParameter("fname"); %>
<%String sn=request.getParameter("sname"); %>
<%String Gend=request.getParameter("gender"); %>
<%String Skill=request.getParameter("skill"); %>
<% String Sports[] = request.getParameterValues("id");%>


<% out.print(fn+" "+sn); %><br>
<%out.print(Gend);%><br>
<%out.print(Skill); %><br>
<% 
for(int i=0;i<Sports.length;i++)
{
	out.print("<p>"+Sports[i]+"</p>");
}

%>


<%
out.print("<table border=2>");
out.print("<th>"+"Student"+"</th>");
out.print("<tr>"+"<td>Fname</td>"+"<td>Sname</td>"+"<td>gender</td>"+"<td>Skill</td>");

out.print("<tr>"+"<td>"+fn+"</td>"+"<td>"+sn+"</td>"+"<td>"+Gend+"</td>"+"<td>"+Skill+"</td>"+"<td>"+"</td>"+"</tr>");
out.print("</table>");
%>
<% 
out.print("<table border=2>");
 
for(int i=0;i<Sports.length;i++)
{
	out.print("<tr>"+"<td>");
	out.print(Sports[i]);
	out.print("</td>"+"</tr>");
	
}
out.print("</table>");

%>








</body>
</html>