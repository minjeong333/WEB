package day04Prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	
//하나의 서블릿은 하나의 요청을 처리한다
//하나의 서블릿은 get, post를 나눠서 처리한다


//서블릿 -> service 오버라이드 하여 요청을 처리하였음 !! 
//서블릿 -> service (요청방법을 얻어와서 get, post인지 알 수 있음) -> doGet, doPost를 호출 !! 요청을 구분해서 처리하기


@WebServlet("/lotte.do")
public class MyServlet extends HttpServlet{
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().print("get");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("post");
	}
}
