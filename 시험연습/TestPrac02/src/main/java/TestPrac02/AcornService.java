package TestPrac02;

import java.util.ArrayList;

public class AcornService {

	AcornDAO dao = new AcornDAO();
	
	public ArrayList<Acorn> getMembers(){
		
		ArrayList<Acorn> result =  dao.selectAll();
		return result;
		
	}
}
