<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h2> 에이콘 학생 등록하기 </h2>

<form action="/day05Prac/acorn/reg" method="post"> <!-- id=test01&name=테스터&pw=11234... => 요청바디에 담긴다 -->
	<input type="text" name="id">
	<input type="text" name="name">
	<input type="text" name="pw">
	<input type="text" name="point">
	<input type="text" name="birth">
	
	<button>등록</button>
</form>


</body>
</html>