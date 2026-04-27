package day09Prac;

public class HelloService {

	public int getLength(String str) throws Exception{
		int cnt=0;
		
		try {
		cnt = str.length();  //에외 발생 가능
		}
		catch(Exception e) {  //예외  = Exception 계열, RuntimeException
			System.out.println(e.getMessage());
			throw e; // 예외를 다시 일으키기, 상위에게 예외 전파하기 
		}
		
		return cnt;
	}
}
