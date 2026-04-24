package day08Prac.eljstl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/acornlist")
public class AcornlistServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//모델
		AcornService service = new AcornService();
		ArrayList<Acorn> list = service.getMemberList();

		req.setAttribute("list", list);
		
		req.getRequestDispatcher("/WEB-INF/views/listacorn2.jsp").forward(req, resp);
	}
}
