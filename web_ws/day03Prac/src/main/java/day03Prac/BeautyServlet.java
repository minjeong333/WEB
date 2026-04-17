package day03Prac;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//Controller 
//주문 정보 출력

//url매핑해주기 : 어떤 주소(/beautyAll)로 접속해야 하는가 : 브라우저 접속 주소
@WebServlet("/beautyAll")
public class BeautyServlet  extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		 
 	
		BeautyService service  =  new  BeautyService();
		ArrayList<Beauty> list  =service.getBeautyListAll();
		
		//db연결이 잘 되어 데이터가 잘 들어와있는지 콘솔창에사 확인용
//		if(list == null) {
//		    System.out.println("리스트 자체가 null입니다.");
//		} else {
//		    System.out.println("리스트 크기: " + list.size() + "개");
//		}
		
		//데이터 바인딩 : JSP에서 사용할 이름("list") 명시!!
		//결과 데이터를 request 영역에 저장 (JSP에서 사용 가능하게 함)
		req.setAttribute("list", list);
	 
		//이동 경로: 결과 화면으로 쓰이는 JSP 파일의 위치.
		//View(JSP)로 제어권 전환 (Forward 방식)
		req.getRequestDispatcher("WEB-INF/views/beauty.jsp").forward(req, resp);
		
		 
		
	}
}
