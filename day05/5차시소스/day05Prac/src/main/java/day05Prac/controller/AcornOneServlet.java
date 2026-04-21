package day05Prac.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day05Prac.dto.Acorn;
import day05Prac.service.AcornService;

@WebServlet("/acorn/detail")
public class AcornOneServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//사용자 정보 가져오기
		String id = req.getParameter("id");
		
		
		//학생정보 - 한 명  : 모델 
		AcornService service = new AcornService();
		Acorn acorn = service.getAcornStudentById(id);
		
		//
		req.setAttribute("acorn", acorn);
		
		
		
		//뷰
		req.getRequestDispatcher("/WEB-INF/views/acorn/updateForm.jsp").forward(req, resp);
	}
}
