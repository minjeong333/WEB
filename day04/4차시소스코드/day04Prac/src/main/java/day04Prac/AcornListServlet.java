package day04Prac;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acornList")
public class AcornListServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//model 가져오기(어디서? AcornService에서)
		AcornService service = new AcornService();
		ArrayList<Acorn> list = service.getMembers(); //에이콘학생정보 => Model
		
		req.setAttribute("list", list);
		
		
		req.getRequestDispatcher("/WEB-INF/views/acornView.jsp").forward(req, resp);

	}
}
