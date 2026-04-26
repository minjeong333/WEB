package TestPrac01;

import java.util.Date;

public class Acorn {
	
	
	String id;
	String pw;
	String Name;
	int point;
	Date birthday;
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
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public Acorn() {
		
	}
	
	public Acorn(String id, String pw, String name, int point, Date birthday) {
		super();
		this.id = id;
		this.pw = pw;
		Name = name;
		this.point = point;
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		return "Acorn [id=" + id + ", pw=" + pw + ", Name=" + Name + ", point=" + point + ", birthday=" + birthday
				+ "]";
	}
	
	
	
	
}
