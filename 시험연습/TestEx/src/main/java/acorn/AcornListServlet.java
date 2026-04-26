package acorn;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/acorn/list")
public class AcornListServlet extends HttpServlet { //controller담당

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			//model 담당
			AcornService service = new AcornService(); //AcornService에 있는 내용을 가져와야지
			ArrayList<Acorn> list = service.getMembers(); 
			
			
			//model을 저장하기 = request에 저장하기
			req.setAttribute("list", list);
			
			//모델을 뷰에 포워드 시키기
			req.getRequestDispatcher("/WEB-INF/views/acorn/list.jsp").forward(req, resp); //view담당
		}
}
