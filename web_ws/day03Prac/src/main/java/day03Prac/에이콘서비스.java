package day03Prac;

public class 에이콘서비스 {
	
	AcornDAO dao =  new AcornDAO();
	
	public void acornRegister(Acorn acorn) {
		//
		
		dao.insertMember(acorn);
	} 
}
