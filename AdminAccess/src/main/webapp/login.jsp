<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<style>
.log{
border:solid blue;
width:30%;
height:50px:
  align:center;
  margin-top: 10%;
  margin-left: 30%;

}
input{
margin:10px;

}
image{
width:50px;
height: 50px;
}


</style>
</head>
<body>
<%
String ms=(String)request.getAttribute("msg");
%>


<div class="log">

<% 
if(ms!=null){
	


out.print(ms);
}%>
<form action="./login" method="post">
<img src="C:\Users\srima\Downloads\login.jpeg"></image><br>

<label for="empid">EnterEmpId</label><br>

<input type="text" name="empid"><br>

<label for="password">Password</label><br>
<input type="password" name="password"><br>
<input type="submit" value="Login">



</form></div>



</body>
</html>