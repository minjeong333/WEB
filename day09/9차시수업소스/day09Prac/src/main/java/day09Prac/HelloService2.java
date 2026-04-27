package day09Prac;

public class HelloService2 {

	public int getLength(String str) {
		
		int cnt=0;
		cnt = str.length();  //에외 발생 가능
		return cnt;
	}
}
