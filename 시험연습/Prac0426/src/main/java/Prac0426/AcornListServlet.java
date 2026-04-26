package Prac0426;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acornlist")
public class AcornListServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		AcornService service = new AcornService(); //서비스 객체 만들기 = 에이콘 서비스에 있는 내용을 가져와야지 
		ArrayList<Acorn> list = service.getMembers(); // list 받아오기
		
		
		req.setAttribute("list", list);
		
		req.getRequestDispatcher("WEB-INF/views/list.jsp").forward(req, resp);
		
		
	}
}
