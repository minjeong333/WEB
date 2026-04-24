<%@page import="day08Prac.eljstl.Acorn"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title> 
</head>
<body>
 


<table>


<c:forEach    var="item"  items="${list}">
		<tr>
			<td> ${item.id}</td>
			<td> ${item.pw}</td>
			<td> ${item.name}</td>
		</tr>
</c:forEach>



</table>
</body>
</html>