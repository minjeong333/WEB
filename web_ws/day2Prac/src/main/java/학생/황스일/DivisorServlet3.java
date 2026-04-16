package 학생.황스일;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/divisor3")
public class DivisorServlet3 extends HttpServlet {
	
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        //사용자로부터 받은 수
        int num = Integer.parseInt(req.getParameter("num"));
        
        //==>별도의 자바코드로 분리하기
        out.println("<h1>" + num + "의 약수</h1>");

        /*
        MyUtil util = new MyUtil();
        ArrayList<Integer> list  = util.getDivisor(num);   //
        */
        
        DanService service = new DanService();
        ArrayList<Integer> list = service.getDivisor(num);
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Insert title here</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2> 약수 구하기 </h2>");
        out.println("<ul>");
        for( int  su : list) {
        	out.println("<li>" +su+"</li>");
        }
        for(int i=0; i<list.size(); i++) {
        	out.println(list.get(i) + "<br>");
        }
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
       
       
       
       
       
       
       
       

      

      
      
       
       
       
   
     
    }
}