package TestPrac01;

import java.util.ArrayList;

public class AcornService {
	
	AcornDAO2 dao = new AcornDAO2(); //dao불러오기
	
	public ArrayList<Acorn> getMembers() {
		
		ArrayList<Acorn> result = dao.findAll();
		return result;
		
	}
}


