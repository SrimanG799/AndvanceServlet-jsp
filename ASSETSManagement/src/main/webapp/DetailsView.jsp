<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.model.AddAssets"%>
<%@page import="java.util.List"%>
    <% %>
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
}
</style>
</head>
<body>
<h1>WelcomeViewDeatailsinjsp</h1>
<% 
List<AddAssets> deatails=(List<AddAssets>)request.getAttribute("assets");


%>
<table barder="2px">
<tr><th>rfid</th><th>assetTag</th><th>serialNumber</th><th>description</th><th>friendlyName</th><th>model</th>
<th>manufacturar</th><th>date</th><th>cost</th><th>room</th><th>pcontact</th><th>secondContact</th><th>controler</th></tr>

<%
for(AddAssets a:deatails)
{

%>

<tr>

<td><%= a.getRfid()%></td>
<td><%= a.getAssetTag()%></td>
<td><%= a.getSerialNumber()%></td>
<td><%= a.getDescription()%></td>
<td><%= a.getFirendlyName()%></td>
<td><%= a.getModel()%></td>
<td><%= a.getManufacturer()%></td>
<td><%= a.getDate()%></td>
<td><%= a.getCost()%></td>
<td><%= a.getRoom()%></td>
<td><%= a.getpContact()%></td>
<td><%= a.getSecContact()%></td>
<td><a href="edit?sriman=<%= a.getRfid() %>">Edit</a></td>
<td><a href="delete?sriman=<%= a.getRfid() %>">Delete</a></td>


</tr>


<%
}
%>
</table>

</body>
</html>