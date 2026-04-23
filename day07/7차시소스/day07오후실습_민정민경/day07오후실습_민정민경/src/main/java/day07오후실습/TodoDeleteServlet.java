package day07오후실습;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//삭제하기
//1. 사용자 세션 얻어오기(필수)   getSession(false)
//2. cartList 꺼내기
//3. 해당 상품을 cartList 삭제하기


@WebServlet("/deleteTodo")
public class TodoDeleteServlet   extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
		req.setCharacterEncoding("utf-8");
		
		String task  = req.getParameter("todoItem");
		System.out.println("삭제 요청 받은 항목: [" + task + "]"); // 디버깅용
		
		 
		//사용자의 세션 얻어오기, 없으면 null 반환
		HttpSession session = req.getSession(false);
		
		if(session != null) {
			
			ArrayList<String> todoList   = (ArrayList<String>) session.getAttribute("todoList");		
			
			
			//세션에  todoList 가 있으면
			if( todoList != null && task != null) {
				
				//trim() => 미세한 공백 차이 해결
				String target = task.trim();
				int removeIndex = -1;
				
				//해당 항목 삭제
				for( int i=0; i< todoList.size(); i ++) {
					if( todoList.get(i) != null && todoList.get(i).trim().equals(target)) {  
						removeIndex  = i;
						break;
					}
				}	
				if(removeIndex != -1) {
					todoList.remove(removeIndex);
				}else {
					System.out.println("삭제 대상을 찾을 수 없습니다:" + target);
					} 
				}
			}
		resp.sendRedirect(req.getContextPath() + "/todo");
	}
}
