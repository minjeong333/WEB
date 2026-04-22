package day06Prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.google.gson.Gson;

//메뉴 추천 이름, 가격
@WebServlet("/food2")
public class FoodServlet2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Food food = new Food("야채", 12000); //{ 키:값, 키:값 } => 객체 형태의 문자열 구조를 가진 것 => json
		//
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("application/json;charset=utd-8");
		
		//자바객체  ->  json 변환
		
		
		//
		//
		//
		
		PrintWriter out = resp.getWriter();
		//out.print("{\"name\":\"스파게티\", \"price\":12000}");
		//out.print("{\"name\":\""+food.getName()+"\", \"price\":"+food.getPrice()+"}");
		
//		JSONObject o = new JSONObject();
//		o.put("name", food.getName());
//		o.put("price", food.getPrice());
//		
//		out.print(o.toString());
		
		
		Gson gson = new Gson();
		String result = gson.toJson(food);
		out.print(result);
		
		
	}
}
