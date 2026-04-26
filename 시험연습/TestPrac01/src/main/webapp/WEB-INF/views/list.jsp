<%@page import="TestPrac01.Acorn"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<Style>
	table{
	border:1px solid black;
	text-align:center;
	margin:0 auto;
	}
	td{
	border:1px solid black;
	}
	h2{
	text-align:center;
	}
</Style>

</head>
<body>

<h2> 에이콘 학생 전체 조회 </h2>
<%  ArrayList<Acorn> list = (ArrayList<Acorn>) request.getAttribute("list"); %>


<table>
<tr>
<td>아이디</td>
<td>이름</td>
<td>포인트</td>
<td>생년월일</td>
<td>비밀번호</td>
</tr>


<%for(Acorn acorn : list) {%>
<tr>
<td><%=acorn.getId() %></td>
<td><%=acorn.getName() %></td>
<td><%=acorn.getPoint() %></td>
<td><%=acorn.getBirthday() %></td>
<td><%=acorn.getPw() %></td>
</tr>

<%} %>
</table>
</body>
</html>