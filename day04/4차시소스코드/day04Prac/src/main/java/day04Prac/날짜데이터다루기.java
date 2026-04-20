package day04Prac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 날짜데이터다루기 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
		String id="hee";
		String pw="1234";
		String name="김건희";
		int point= 5000;
		Date birth = null;
		
		
		// "문자열" -> Date  변환하기 
		// "2002-10-10"
		String strBirth="2002-10-^^10안녕^^^^";
		SimpleDateFormat sf  = new SimpleDateFormat("yyyy-mm-dd");
		
		try {
			sf.parse(strBirth);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("날짜형식이 안맞다");
			//예와상황을 인식하고 처리한 후  예외 다시 일으키기를 할 수 있다
			throw e;
			
		}
		
		
		System.out.println("정상종료 ");
		

	}

}
