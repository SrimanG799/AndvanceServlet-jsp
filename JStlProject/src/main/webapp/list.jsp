<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="2px">
<tr>
     <th>ID</th>
     <th>name</th>
     <th>campany</th>
     <th>salary</th>
     </tr>
     
     
     <c:forEach var="e" items="${sriman}">
     <tr>
       <td>${e.roll}</td>
       <td>${e.name }</td>
       <td>${e.campany}</td>
       <td>${e.salary }</td>
       
       </tr>
     
     
     
     </c:forEach>
     
     



</table>

</body>
</html>