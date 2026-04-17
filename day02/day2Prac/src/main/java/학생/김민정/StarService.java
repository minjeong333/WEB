package 학생.김민정;

/*
//2단계. Service 클래스 
       : 순수한 자바 코드로만 이루어진 "계산기". 서블릿 기능을 몰라도 동작해야 함 
       
       순서 : 서블릿의 for문이나 계산 로직을 복사하여 별도의 클래스 매서드로 만들기
       ⭐ 서블릿에서 바로 쓰려면 매서드에 static을 붙이거나, 서블릿 안에서 new로 객체를 생성할 것
*/
public class StarService {

	public String getStar(int count) {
		StringBuilder s = new StringBuilder();
		for(int i=1; i<=count; i++){
			s.append("*");
		} 
		
		return s.toString();

	}


}
