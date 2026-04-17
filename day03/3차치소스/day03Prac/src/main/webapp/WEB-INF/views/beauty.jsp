<%@page import="java.util.ArrayList"%>
<%@ page import="day03Prac.Beauty" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뷰티 주문 목록</title>
<style>
	<style>
    table {
        border-collapse: collapse; /* 선 겹침 방지 */
        width: 80%;
    }
    th, td {
        border: 1px solid black;
        padding: 10px;
        text-align: center;
    }
</style>
</style>
</head>
<body>
<h2> 주문 결과 출력 </h2>

<table>
	<thead>
		<tr>
			<th>고객명</th>
			<th>주문상품</th>
			<th>주문수량</th>
			<th>가격</th>
			<th>주문상태</th>
			<th>배송상태</th>
		</tr> 
	</thead>
	
	<tbody>
	<!-- Servlet에서 보낸 데이터 중 "List"라는 이름으로 보낸 데이터를 꺼냄 how? 반복문으로 
		!!주의!! Beauty 클래스가 import 되어 있어야 info.getName같은 getter를 쓸 수 있음!!	
	-->
	<% ArrayList<Beauty> beautyList = (ArrayList<Beauty>) request.getAttribute("list"); 
	
		for(Beauty info : beautyList){ 
	%>	
	
		<tr>
		<td><%= info.getName()%></td>
		<td><%= info.getProduct()%></td>
		<td><%= info.getQuantity()%></td>
		<td><%= info.getPrice()%></td>
		<td><%= info.getOrderStatus()%></td>
		<td><%= info.getDeliverStatus()%></td>
		
		</tr>
	<%  
			} 

	%>	
	</tbody>
</table>
</body>
</html>