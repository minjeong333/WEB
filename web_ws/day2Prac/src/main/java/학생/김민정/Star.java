package 학생.김민정;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 //3단계. Servlet클래스 
  		: 요청을 받고, 서비스를 호출하고, 결과를 전달하는 "중간 관리자".
  		
  		순서: getParameter로 데이터를 받고, Service 클래스에 일을 시킨 뒤, 그 결과를 응답에 담는다.
  		
  		주의사항 : 이제 서블릿은 로직(for문 등)을 직접 들고 있지 않고, 서비스가 준 결과물(String 등)을 뿌려주기만 함.
 */

@WebServlet("/star1")
public class Star extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		
		
		//파라미터 값 가져오기
		//HTML화면에서 사용자가 입력한 값을 자바(서블릿)으로 가져오는 통로 역할 
		String cnt=  req.getParameter("cnt");  // cnt라는 이름을 키로 값을 얻어옴 
		
		//숫자로 형변환하기
		int count = Integer.parseInt(cnt);
		
		StarService service = new StarService();
		String stars = service.getStar(count);
		
		//한글깨짐 방지(응답 전에 작성)
		resp.setCharacterEncoding("utf-8"); //서버 -> 인코딩 utf-8 (실제 서버가 보낼 때 인코딩)
		resp.setContentType("text/html;charset=utf-8"); // 클라이언트 (웹브라우저)에게 해석에 대한 정보

		
		//응답하기
		PrintWriter   out  = resp.getWriter();		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>결과: " + stars + "</h2>");
		out.println("</body>");
		out.println("</html>");
	}

}
