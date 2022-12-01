 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentReg</title>
</head>
<body>
<form action="Student_Resp.jsp">
FirstName<input type="text" name="fname"><br>
SecondName<input type="text" name="sname"><br>
Gender<label><input type="radio" name="gender" value="male">Male</label>
    <label><input type="radio" name="gender" value="female">FeMale</label><br>

Skils<select name="skill">
<option>Java</option>
<option>python</option>
<option>C#</option>
<option>Matlab</option>
<option>VLSI</option>
</select><br>
<input type="checkbox" name="id" value="Cricket"> Cricket<BR>
<input type="checkbox" name="id" value="Walliball"> wallibal<BR>
<input type="checkbox" name="id" value="Hacki"> hacki<BR>
<input type="checkbox" name="id" value="Golf"> golf<BR>
<input type="checkbox" name="id" value="chess"> chess <BR>
<input type="date" name="date">


<input type="submit" value="save">

</form>

</body>
</html>