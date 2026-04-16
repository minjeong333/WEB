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


@WebServlet("/fighting2")
public class 화이팅메세지랜덤  extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		
		ArrayList<String> messages = new ArrayList<>();
		
		messages.add("오늘도 정말 고생 많았어요! 당신은 최고예요! 👍");
        messages.add("지치지 마세요, 거의 다 왔어요! 화이팅! 🔥");
        messages.add("행운은 언제나 당신 편입니다. 행운을 빌어요! ✨");
        messages.add("잠시 쉬어가도 괜찮아요. 당신의 속도를 응원합니다. ☕");
        messages.add("오늘 하루도 빛나는 당신을 응원해요! 🌟");
        
        Random random = new Random();
        int randomIndex = random.nextInt(messages.size());
		
		
		PrintWriter  out = resp.getWriter();
		out.println("<h2>오늘의 랜덤 메시지 </h2>");
		out.print( messages.get(randomIndex));    // m.toString()
		
		
		
	}
	
}
