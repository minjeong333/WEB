package day05Prac.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day05Prac.service.AcornService;

@WebServlet("/acorn/delete")
public class AcornDeleteServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 String id=req.getParameter("id");  //없으면 null반환
		 
		 AcornService service = new AcornService();
		 boolean result = service.deleteAcornStudent(id);
		 System.out.println(result);
		 
		 //응답뷰 ok 또는 재요청
		 resp.sendRedirect("/day05Prac/acorn/list");
	}
}
