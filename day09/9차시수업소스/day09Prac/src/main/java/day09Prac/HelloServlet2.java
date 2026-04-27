package day09Prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello2")
public class HelloServlet2 extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//1.try~catch
		//2.에러코드, exception-type 예외page가 응답되게 하기 - web.xml
		
		String str = req.getParameter("str");
		
		HelloService2 service = new HelloService2();
			
		int cnt = service.getLength(str);
		req.setAttribute("cnt", cnt);
		
		req.getRequestDispatcher("/WEB-INF/views/hello2.jsp").forward(req, resp);
	
		
		
	
	}
}
