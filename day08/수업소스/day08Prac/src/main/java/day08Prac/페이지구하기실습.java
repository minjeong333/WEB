package day08Prac;

public class 페이지구하기실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pageSize = 5; // 한 페이지에 보이는 글의 수
		int grpSize = 4; // [1] [2] [3] [4]
		int totRecords = 46;
		int currentPage = 1;

		// [1] [2 ] [3] [4] =>1
		// [5] [6] [7] [8] =>2

		// 구해야 한 값
		int totalPage;
		int currentGrp; // !! 현재페이지에 대한 현재그룹 구하기 !! 핵심
		int grpStartPage; //
		int grpEndPage; //

		int remain = totRecords % pageSize;

		if (remain == 0) {
			totalPage = totRecords / pageSize;
		} else {
			totalPage = (totRecords / pageSize) + 1;
		}

		System.out.println(totalPage);

		
		// 현재페이지에대한 현재그룹 구하기
		int remain2 = currentPage % grpSize;

		// 나머지확인
		if (remain2 == 0) {
			currentGrp = currentPage / grpSize;
		} else {
			currentGrp = currentPage / grpSize + 1;
		}

		// 1 *4 -> 1~4
		// 2 *4 -> 5~8

		grpStartPage = (currentGrp - 1) * grpSize + 1;
		grpEndPage = currentGrp * grpSize;

		
		
		// 마지막 grpEndPage 확인 ( totalPage 보다 크다면 갱신이 필요함 )
		if (grpEndPage > totalPage) {
			grpEndPage = totalPage;
		}

		// 페이징정보

		System.out.println("현재페이지 " + currentPage);
		System.out.println("전체페이지" + totalPage);
		System.out.println("현재그룹" + currentGrp);
		System.out.println("그룹의 시작" + grpStartPage);
		System.out.println("그룹의 끝" + grpEndPage);

		for (int i = grpStartPage; i <= grpEndPage; i++) {
			System.out.print("[" + i + "]  ");
		}
	}

}