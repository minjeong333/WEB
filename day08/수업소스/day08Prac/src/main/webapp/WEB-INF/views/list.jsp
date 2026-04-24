<%@page import="day08Prac.PagingHandler"%>
<%@page import="day08Prac.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	ArrayList<Member>  list = (ArrayList<Member>) request.getAttribute("list");
	PagingHandler handler = (PagingHandler) request.getAttribute("handler");
%>


<table>
	<tr>
	<td></td>
	<td></td>
	</tr>
	
	<% for(Member member : list) {%>
	<tr>
	<td><%=member.getM_id() %></td>
	<td><%=member.getM_pw() %></td>
	</tr>
	<%} %>
</table>

<!-- 이전 -->
<!-- 현재그룹이 1보다 크다면  -->

<%
	if(handler.getCurrentGrp()  >  1){ //첫번째 그룹이 아니라는 얘기 -> 이전이 나오게 해야지
%>
		<a href="/day08Prac/listpage?p=<%=handler.getGrpStartPage()-1 %>">[이전]</a>
<%
	}
%>

<!-- 페이지네이션 정보 출력하기 -->
<% for(int i=handler.getGrpStartPage(); i<=handler.getGrpEndPage(); i++){ %>
  
   <a href="/day08Prac/listpage?p=<%=i %>"> [ <%=i %> ]</a>
   
<%} %>

<!-- 다음 -->

<% 
	if(handler.getGrpEndPage()  <  handler.getTotalPage()){
%>
		<a href="/day08Prac/listpage?p=<%=handler.getGrpEndPage()+1 %>">[다음]</a>

<%
	}
%>

<!-- 
	
   <a href="/day08Prac/listpage?p=1"> [ 1 ]</a>
  
   <a href="/day08Prac/listpage?p=2"> [ 2 ]</a>
   
   <a href="/day08Prac/listpage?p=3"> [ 3 ]</a>
   
 -->

</body>
</html>