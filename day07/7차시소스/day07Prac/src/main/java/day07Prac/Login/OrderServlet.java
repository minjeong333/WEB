package day07Prac.Login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/order.do")
public class OrderServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//로그인 되어 있는지 확인
		
		//
		HttpSession session = req.getSession(false);
		String id = (String)session.getAttribute("id");
		
		
		if(session != null && id != null) {
			
			req.getRequestDispatcher("/WEB-INF/views/order.jsp").forward(req, resp);
		}else {
			//로그인할 수 있는 요청을 해야함 (로그인 재요청 : redirect)
			resp.sendRedirect(req.getContextPath()+"/login");
		}
	
	}
}
