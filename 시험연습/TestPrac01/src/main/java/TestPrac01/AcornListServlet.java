package TestPrac01;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/acorn/list02")
public class AcornListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		AcornService service = new AcornService();
		ArrayList<Acorn> list = service.getMembers();
		
		req.setAttribute("list", list);
		
		req.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(req, resp);
		
	}
}

//서블릿이 뭔데? 
//		
//		사용자가 웹매핑 주소로 들어와  
//		
//		서블릿이 서비스한테 정보를 달라고 요청하네 
//		
//		가져온 정보(모델)을 request라는 저장소에 저장할거야 
//		
//		저장한 정보를 뷰에 포워드로 뿌려줄거야 
//		
//		


		
		

