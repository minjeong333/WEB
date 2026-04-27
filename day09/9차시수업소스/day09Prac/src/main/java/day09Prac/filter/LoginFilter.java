package day09Prac.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



//1. Filter  인터페이스 상속하기 
//2. doFilter 오버라이드 하기
//3. 세션에서 로그인정보 확인하기
//4. 필터로 등록하기 ( 매핑정보)


@WebFilter("*.do")
public class LoginFilter  implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		
		// ServletRequest   -> HttpServletRequest 
		
		// 실제객체는 HttpServletRequest 이고 이것을  부모클래스로 업캐스팅 되어  사용한다. 
		// 다운캐스팅을 해야지 자식객체의 매서드를 사용할 수 있다 .
		
		
		
		//세션가져오기
		//세션에 저장된 아디디 정보 가져오기 
		// 있다면  => 정상적인 흐름 보내기
		// 없다면  => 로그인 재요청하기 
		
		
		System.out.println("loginFilter ~~~");
		
		
		HttpServletRequest request_    =  (HttpServletRequest) request;
		HttpServletResponse response_    =  (HttpServletResponse) response;
	
		
		
	    HttpSession session  = 	request_.getSession(false);
		String id  = ( session != null) ? ( String)  session.getAttribute("id")  : null;
	   
		
		if( id != null) {   //
			
			//정상적인 흐름 
			chain.doFilter(request_, response_);  //
			return;
		}
		
		
		//로그인 안된 경우
		String path  = request_.getContextPath();
		response_.sendRedirect( path  + "/login");
		
		
		
	}

}