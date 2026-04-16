package day01Prec;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/scoreInfo")

public class ScoreInfoServlet  extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 
	resp.setCharacterEncoding("utf-8");
	resp.setContentType("text/html;charset=utf-8");
	
	PrintWriter out =resp.getWriter();
		
	Score score =new Score();
	score.setKor(99);
	score.setEng(88);
	score.setMath(98);
	//	out.println( score.toString());
	out.println( score );
	out.close();	
	
}
}
