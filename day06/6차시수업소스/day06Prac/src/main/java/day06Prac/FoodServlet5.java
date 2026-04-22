package day06Prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

@WebServlet("/food5")
public class FoodServlet5 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//ArrayList<Food> -> json [ {키:값, 키:값}, {}, {} ] (변환), JSONObject, Gson
		
		
		FoodService s = new FoodService();
		String list = s.getFoodList3();
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("application/json;charset=utf-8");
		
		resp.getWriter().print(list);
	}
}
