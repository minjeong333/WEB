package day08Prac.eljstl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/el2")
public class El1Servlet2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		int kor=90;
		
		req.setAttribute("kor", kor);
		
		req.getRequestDispatcher("/WEB-INF/views/scoreEl1Servlet2.java.jsp").forward(req, resp);
		
	}
}
