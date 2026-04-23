package day07오후실습;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//1. 사용자 세션 얻어오기
//  1.1기존에 있는 세션에 csrtList가 있는경우
//		꺼낸 cartList에 장바구니에 추가한 상품 add하기
//	1.2기존에 있는 세션에 cartList가 없는경우
//		새로운 ArrayList cartList를 만들고 상품 add하기
//		세션에 저장하기

@WebServlet("/addTodo")
public class TodoAddServlet   extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
		req.setCharacterEncoding("utf-8");
		String task  = req.getParameter("todoItem");
		
		//
		if(task ==null) {
			resp.sendRedirect(req.getContextPath()+"/list");
			return;
		}
		
		
		
		// 1.세션 저장소 기존 리스트 얻어오기
		HttpSession session = req.getSession();
		ArrayList<String> todoList = (ArrayList<String>) session.getAttribute("todoList"); 
		
		// 2. 리스트가 null이면 새로 생성해서 세션에 저장 
		if( todoList == null) {
			todoList   = new ArrayList<String>(); 
			session.setAttribute("todoList" , todoList);
		}
		
		
		//3. 이제 todoList는 확실히 null이 아니므로, 입력값 있을 때만 추가
		if(task != null && !task.trim().isEmpty()){
			todoList.add(task.trim());
		}
		
		
		 //4. 목록화면으로 이동
		 resp.sendRedirect(req.getContextPath()+"/todo");
	
	}
}
