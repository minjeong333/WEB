package 학생.김민정;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/randomImg")
public class 랜덤한귀여운이미지 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		
		랜덤한이미지Service service = new 랜덤한이미지Service();
		String fileName = service.getImgs();
		
		PrintWriter out = resp.getWriter();
		out.println("<h2>귀여운 랜덤 이미지</h2>");

		
		//⭐<img>태그를 만들어서 출력해야 사진이 나옴!!
		out.print("<img src='day2prac/imgs/" + fileName + "' alt='랜덤동물'>");
		
	}
}
