package day07오후실습;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String id = req.getParameter("id");
		String pw = req.getParameter("pw");

		boolean result = false;

		//회원인지 확인하기 
		//서비스, dao ==>   
		if (id.equals(pw) ) {
			result = true;
		}
		 
				
		//
		if (result) {
			HttpSession session = req.getSession();
			session.setAttribute("id", id);

			resp.sendRedirect(req.getContextPath() + "/home");
		}else {
			
			resp.sendRedirect(req.getContextPath() + "/login?message=id pw not valid");
		}
	}
}
