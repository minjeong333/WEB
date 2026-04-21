package day05Prac.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day05Prac.dto.Acorn;
import day05Prac.service.AcornService;

@WebServlet("/acorn/upate") 
public class AcornUpdateServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		//사용자 정보 가져오기
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		int point = Integer.parseInt(req.getParameter("point"));
		
		
		//모델 가져오기 
		Acorn acorn = new Acorn();
		acorn.setId(id);
		acorn.setPw(pw);
		acorn.setPoint(point);
		
		AcornService service = new AcornService();
		service.modifyAcornStudent(acorn);
		
		//응답 view
		//재요청
		resp.sendRedirect("/day05Prac/acorn/list");
		
	}
}
