<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
 

function 로그인(){
	
    //const id = document.querySelector("[name=id]").value;
    //const pw = document.querySelector("[name=pw]").value;
    
    const frm =  document.frm;  
    const  id  = frm.id;
    const  pw =  frm.pw;
    
    if(  id.value  ==""){
    	 alert("아이디 입력");
    	 id.focus();
    }else  if ( pw.value  =="") {
    	 alert("비밀번호 입력");
    	 pw.focus();
    }else{
    	
    	//
    	frm.submit();
    }
     
    
}
</script>
<style>
form input, button {
    width: 200px;   
    height: 30px;   
    margin-bottom: 10px; /* 간격 */
    box-sizing: border-box; 
}
</style>
</head>
<body>

   <%  
       String messgae  =   request.getParameter("message");
       if( messgae  != null ) {
    	 
   %>
         <p>    <%=messgae %> </p>   
   <%} %>
  <p></p>
	<form name="frm" action="/day07오후실습/login" method="post">
		<input type="text" name="id"><br> 
		<input type="password" name="pw"><br>
		<button  type="button"  onclick="로그인()">로그인</button>
	</form>
	
	
    
</body>
</html>