<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="frm" action="/day03Prac/acornReg" method="post">
<input type="text" name="id"> <!-- 여기서 name은 controller에서 key 값으로 사용됨 ∴ table의 컬럼명으로 하는 것을 추천!! -->
<input type="text" name="pw">
<input type="text" name="name">
<button>회원가입</button>
</form>


</body>
</html>