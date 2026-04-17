package day01Prec;

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
		
		
		ArrayList<String> imgList = new ArrayList<>();
		
		imgList.add("<img src=\"/day2Prac/imgs/고양이.jpg\">");
		imgList.add("<img src=\"/day2Prac/imgs/아기소.jpg\">");
		imgList.add("<img src=\"/day2Prac/imgs/펭귄.jpg\">");
		imgList.add("<img src=\"/day2Prac/imgs/호랑이.jpg\">");
		
		Random random = new Random();
		int RandomIndex = random.nextInt(imgList.size());
		
		PrintWriter out = resp.getWriter();
		out.println("<h2>귀여운 랜덤 이미지</h2>");
		out.print(imgList.get(RandomIndex));
		
	}
}
