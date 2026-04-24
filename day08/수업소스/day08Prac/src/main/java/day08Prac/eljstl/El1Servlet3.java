package day08Prac.eljstl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//영화정보 String[] 모델 출력하기
//el  - jstl
@WebServlet("/el3")
public class El1Servlet3 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		//
		
		String[] movies = {"명량", "왕과사는남자", "몬스터주식회사"};
		req.setAttribute("movie", movies);
		req.getRequestDispatcher("/WEB-INF/views/movie.jsp").forward(req, resp);
		
	}
}
