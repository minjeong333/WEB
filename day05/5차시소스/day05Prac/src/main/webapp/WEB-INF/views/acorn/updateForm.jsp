<%@page import="day05Prac.dto.Acorn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% Acorn acorn = (Acorn) request.getAttribute("acorn"); %>

<form action="/day05Prac/acorn/update" method="post">
	<input type="text" name="id" readonly="readonly" value="<%=acorn.getId() %>" >
	<input type="text" name="pw" value="<%=acorn.getPw() %>">
	<input type="text" name="point" value="<%=acorn.getPoint() %>">
	<input type="text" name="name" readonly="readonly" value="<%=acorn.getName() %>">
	<input type="text" name="birthday" readonly="readonly" value="<%=acorn.getBirth() %>">
	<button>변경</button>
</form>

</body>
</html>