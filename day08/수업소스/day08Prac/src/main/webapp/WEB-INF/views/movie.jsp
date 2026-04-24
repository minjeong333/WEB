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


<!-- var: 변수, 변수는 자동으로 pageContext에 저장!! ∴ EL문법 사용 가능  -->
<c:forEach var="item" items="${movie}">
	${item}
</c:forEach>

</body>
</html>