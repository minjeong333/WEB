package day08Prac;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//listpage?p=2
@WebServlet("/listpage")
public class MemberList extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int currentPage = 1;

		if (req.getParameter("p") != null) {
			currentPage = Integer.parseInt(req.getParameter("p"));
		}

		// 정하는 것
		int pageSize = 2;
		int grpSize = 3; // [1] [2] [3] => 1그룹

		// 모델
		// 페이징조회결과
		// 페이징정보

		MemberService service = new MemberService();
		ArrayList<Member> list = service.getMemberPaging(currentPage, pageSize);
		int totRecords = service.getTotalCnt();
		
		//페이징정보 	public PagingHandler(int pageSize, int grpSize, int totRecords, int currentPage) {
		PagingHandler handler = new PagingHandler(pageSize, grpSize, totRecords, currentPage);
	
		req.setAttribute("list", list);  //4줄 데이터 출력하기
		req.setAttribute("handler", handler);  //하단[1] [2] [3] [4]
		
		
		//view로 포워드
		req.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(req, resp);
	}
}
