<%@page import="org.apache.jasper.tagplugins.jstl.core.Out"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>welcome to jsp i changed my content</h1>
	<h1><%=new Date()%></h1>
	<h1>Expression tag</h1>
	<%=  25 * 4 %><br>
	<%= 25 > 2 %><br>
	
	<h1>Scriptlet element is used to erite multiple values</h1>
  <%=new String("gfff") 
  %>
  <%! int x=10;
  %><br>
<%out.print(x); %>
<h1>Experssin element</h1>


<%=new String("<%= is known as expressian elemnt") 
%>



<h1>expressiaon elemet is used to allow single one object(or)expressian</h1>
<% int x=10;
out.print(x);

%><br>

<%! int add(int a,int b)
{
	int c=(a+b);
	return c;
}
%>
<% out.print(add(10,20)); %><br>
<% int e=10;int f=45;
    out.print(e);
    out.print(f);

%>


</body>
</html>