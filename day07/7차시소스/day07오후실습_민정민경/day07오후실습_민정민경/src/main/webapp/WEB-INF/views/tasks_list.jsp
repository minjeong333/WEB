<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="java.util.ArrayList"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<% ArrayList<String> list =(ArrayList<String>)  request.getAttribute("list"); %>


<h2> 오늘의 To-do 리스트</h2>
<form action ="<%=request.getContextPath() %>/addTodo" method="get">
	<input type="text" name="todoItem" placeholder=" 할 일을 입력하세요">
	<button type="submit">추가</button>
</form> 

<hr>

<%-- <h3> 현재 할 일 목록</h3>

<%
if(list != null) {
    for(String s : list) {
        // s가 null이 아닐 때만 출력하도록 방어 코드 추가
        if(s != null) {
            String contextPath = request.getContextPath();
            // 파라미터 명을 todoItem으로 확실히 고정
            out.println(s + " <a href='" + contextPath + "/deleteTodo?todoItem=" + s + "'>[삭제]</a><br>");
        }
    }
}
%> --%>


</body>
</html>