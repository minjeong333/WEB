<%@page import="Prac0426.Acorn"%>
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
	margin:0 auto;
	}
	td{
	border:1px solid black;
	text-align:center;
	}
	h2{
	text-align:center;
	}
</style>
</head>
<body>

<h2> 전체 학생 조회 </h2>

<%	ArrayList<Acorn> list = (ArrayList<Acorn>)request.getAttribute("list"); %>


 <table>
	 <tr>
	 <td>아이디</td>
	 <td>비번</td>
	 <td>이름</td>
	 <td>포인트</td>
	 <td>생일</td>
	 </tr>
	 
	 <% for( Acorn acorn : list){%>
	 
	 <tr>
	 <td><%=acorn.getId() %></td>
	 <td><%=acorn.getPw() %></td>
	 <td><%=acorn.getName() %></td>
	 <td><%=acorn.getPoint() %></td>
	 <td><%=acorn.getBirth() %></td>
	 </tr>
	 <%} %>
	 
 </table>
</body>
</html>