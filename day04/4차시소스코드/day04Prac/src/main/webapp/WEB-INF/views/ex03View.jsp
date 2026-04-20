<%@page import="day04Prac.Score"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/day04Prac/css/ex03.css">

</head>
<body>

ex03View

<% Score score = (Score)request.getAttribute("data"); %>


<%= score.getMath() %> <!-- score.getMath(); <= 세미콜론 넣으면 안됨 -->


<table>
<tr>
<td>이름</td>
<td>국어</td>
<td>영어</td>
<td>수학</td>
</tr>

<tr>
<td></td>
<td>국어</td>
<td>영어</td>
<td>수학</td>

</tr>



</table>
</body>
</html>