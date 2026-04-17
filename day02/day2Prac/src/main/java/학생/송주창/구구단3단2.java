package 학생.송주창;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dan32")
public class 구구단3단2 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("utf-8");   
		resp.setContentType("text/html;charset=utf-8");  
		
		PrintWriter out = resp.getWriter();  
	
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		
		//3단 제공하기를 별도의 자바파일로 분리하기
		/*
		for(int i = 1; i <= 9; i++) {
			out.println("3 X " + i + " = " + 3 * i + "<br>");
		}
		*/
		구구단서비스 service = new 구구단서비스();
		String[] dan3 = service.get구구단3();
		// out.println("<h2>" + dan3 + "</h2>"); //dan3을 출력하면 배열의 주소값이 나옴
		for(int i=0; i<dan3.length; i++) {
			out.println("<p>" + dan3[i] + "</p>");
		}
		
		out.println("</body>");
		out.println("</html>");
	}
}
