package day04Prac;

import java.util.ArrayList;

public class AcornService {
	
	//
	// AcornService: 회원정보를 주는 클래스
	// model
	
	AcornDAO2 dao = new AcornDAO2();
	
	//전체조회
	public ArrayList<Acorn> getMembers(){
		return dao.selectAll();
		
	}
	
	
	//등록
	public int registerMember(Acorn acorn) {
		return dao.insertMember(acorn);
	}
	
	
}
