package acorn;

import java.util.Date;

public class Acorn {
	
	String id;
	String pw;
	String name;
	int point;
	Date birth;
	
	//1. 생성자 2개 만들기
	//2. setter, getter 만들기
	//3. toString 만들기
	
	public Acorn() { //기본 생성자 만드는 거 잊지 말기 
		
	}
	
	public Acorn(String id, String pw, String name, int point, Date birth) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.point = point;
		this.birth = birth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Acorn [id=" + id + ", pw=" + pw + ", name=" + name + ", point=" + point + ", birth=" + birth + "]";
	}
	
}