<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">insert Details</h1>
<form action="./save" method="post">
<table align="center" border="2px">
<tr>
<td><label for ="roll" >roll</label></td>
<td><input type="text" name="roll" placeholder="roll"></td>
</tr>
<tr>
<td><label for="name">Name</label></td>
<td><input type="text" name="name" placeholder="name">
</td></tr>
<tr>
<td><label for="campany">campany</label></td>
<td><input type="text" name="campany" placeholder="campany"></td>
</tr>
<tr>
<td><label for="salary">salary</label></td>
<td><input type="text" name="salary" placeholder="salary"></td></tr>
<tr>
<td><input type="submit" value="save"></td></tr>


</table>




</form>

</body>
</html>