package day05Prac.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day05Prac.dto.Acorn;
import day05Prac.service.AcornService;

@WebServlet("/acorn/list")
public class AcornListController extends HttpServlet { //controller담당

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			//model 담당
			AcornService service = new AcornService();
			ArrayList<Acorn> list = service.getMembers();
			
			
			//model심기 = model을 저장하기 = 저장소 사용  (request), (session), applicationContext, pageContext,  쿠키)
			req.setAttribute("list", list);
			req.getRequestDispatcher("/WEB-INF/views/acorn/list.jsp").forward(req, resp); //view담당
		}
}
