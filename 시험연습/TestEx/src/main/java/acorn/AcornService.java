package acorn;


import java.util.ArrayList;


public class AcornService {

	AcornDAO dao = new AcornDAO(); // 의존성 dependency

	public ArrayList<Acorn> getMembers() {

		ArrayList<Acorn> result = dao.selectAll();
		return result;
	}
}
