package day09Prac.filter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/order.do")
public class OrderServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		/*
		 * 
		 * 세션저장소에 로그인정보를 확인한 후
		 * 로그인된 사람에게만 주문정보화면 보여주기
		 * 아니면 로그인을 재요청 redirect
		 * 
		 * 
 		 */
		
		/*
		HttpSession session = req.getSession(false);
		
		if(session != null) {
			if(session.getAttribute("id") != null) { //로그인을 한 사람
				
				//로그인된 사람이 보는 뷰
				req.getRequestDispatcher("WEB-INF/views/order.jsp").forward(req, resp);
			} else {
				//
				resp.sendRedirect(req.getContextPath() + "/login");
			}
		}else {
				//
				resp.sendRedirect(req.getContextPath() + "/login");
		}
		*/
		
		req.getRequestDispatcher("/WEB-INF/views/order.jsp").forward(req, resp);
	}
}
