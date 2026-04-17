package day01Prec;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/double01")
public class 두배만들기서블릿 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		
		int su =5;
		int result  = 5*2;
		
		resp.setCharacterEncoding("utf-8"); //서버 -> 인코딩 utf-8 (실제 서버가 보낼 때 인코딩)
		resp.setContentType("text/html;charset=utf-8"); // 클라이언트 (웹브라우저)에게 해석에 대한 정보

		
		//응답하기
		PrintWriter   out  = resp.getWriter();		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println( result);
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
