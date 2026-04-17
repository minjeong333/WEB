package day01Prec;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/double03")
public class 구구단출력하기 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		
		//파라미터 값 가져오기
		String dan_=  req.getParameter("dan");  // dan라는 이름을 키로 값을 얻어옴 
		//숫자로 변환해서 사용해야함 
		
		int dan  = Integer.parseInt(dan_);  // "5"  => 5   "125"  ->125
		
		
		resp.setCharacterEncoding("utf-8"); //서버 -> 인코딩 utf-8 (실제 서버가 보낼 때 인코딩)
		resp.setContentType("text/html;charset=utf-8"); // 클라이언트 (웹브라우저)에게 해석에 대한 정보
		
		
		//응답하기
		PrintWriter   out  = resp.getWriter();		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		
		for(int i=1; i<10; i++){
			out.println(dan + " * " + i + " = " + (dan*i) + "<br>" );
		} ;
		
		out.println("</body>");
		out.println("</html>");
	}

}
