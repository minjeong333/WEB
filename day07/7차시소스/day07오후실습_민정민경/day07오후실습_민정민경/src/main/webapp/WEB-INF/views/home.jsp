<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String path = (String)request.getContextPath();%>
<%String id =  (String)session.getAttribute("id");%>

<a href="<%=path%>/login">로그인하기</a><br>
<a href="<%=path%>/logout">로그아웃하기</a><br>
<a href="<%=path%>/list">To-do List 추가하기</a><br>
<a href="<%=path%>/deleteTodo">To-do List 삭제하기</a><br>

</body>

</html>