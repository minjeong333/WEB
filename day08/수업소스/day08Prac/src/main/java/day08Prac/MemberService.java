package day08Prac;

import java.util.ArrayList;

public class MemberService {
	
	MemberDAO dao = new MemberDAO();
	
	
	//페이징 조회
	public ArrayList<Member> getMemberPaging(int page, int pageSize){
		return dao.findPaging(page, pageSize);
	}
	
	
	// 전체 레코드 수
	
	public int getTotalCnt() {
		return dao.countAll();  //select count(*) from member_tbl_11;
	}
	
	
}
