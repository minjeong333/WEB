package Prac0426;

import java.util.ArrayList;


//DAO를 호출해서 리턴만 하는 매서드 
public class AcornService {
	
	AcornDAO dao = new AcornDAO();
	
	public ArrayList<Acorn> getMembers(){ 
		return dao.selectAll();
	}
	
}
