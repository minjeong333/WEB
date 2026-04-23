package day07오후실습;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/todo")
public class TodoServlet  extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		
		HttpSession session = req.getSession(false);
		Object result =  session.getAttribute("todoList");
		
		
		//세션에서 장바구니 가져오기가 있으면
		if( result != null) {
			ArrayList<String> list = (ArrayList<String>) result;
			req.getRequestDispatcher("/WEB-INF/views/todoList.jsp").forward(req, resp);
			 
		}
		
		
	}

}
