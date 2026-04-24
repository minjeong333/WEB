<%@page import="day08Prac.eljstl.Acorn"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
	border:1px solid black;
	}
	td{
	border:1px solid black;
	}
</style>
</head>
<body>

<% ArrayList <Acorn> list = ( ArrayList <Acorn> ) request.getAttribute("list");%>

<table>
	<tr>
	<td>id</td>
	<td>pw</td>
	<td>name</td>
	</tr>
	
<% for(Acorn acorn : list) {%>	
	<tr>
	<td><%=acorn.getId() %></td>
	<td><%=acorn.getPw() %></td>
	<td><%=acorn.getName() %></td>
	</tr>
<% }%>
</table>

</body>
</html>