package day08Prac;

public class PagingHandler {

	int pageSize;
	int grpSize;
	int totRecords;
	int currentPage; // 매개변수가 있는 생성자로 받을 것임

	int totalPage;
	int currentGrp; // !! 현재페이지에 대한 현재그룹 구하기 !! 핵심
	int grpStartPage; //
	int grpEndPage; //

	// 생성자

	private void calcPaging() {

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

	}

	public int getPageSize() {
		return pageSize;
	}

	public int getGrpSize() {
		return grpSize;
	}

	public int getTotRecords() {
		return totRecords;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public int getCurrentGrp() {
		return currentGrp;
	}

	public int getGrpStartPage() {
		return grpStartPage;
	}

	public int getGrpEndPage() {
		return grpEndPage;
	}

	public PagingHandler(int pageSize, int grpSize, int totRecords, int currentPage) {
		super();
		this.pageSize = pageSize;
		this.grpSize = grpSize;
		this.totRecords = totRecords;
		this.currentPage = currentPage;

		calcPaging();
	}

	public static void main(String[] args) {

		// PagingHandler(int pageSize, int grpSize, int totRecords, int currentPage) {
		PagingHandler handler = new PagingHandler(5, 4, 46, 5);

		int totalPage = handler.getTotalPage();
		int currentGrp = handler.getCurrentGrp();
		int grpStartPage = handler.getGrpStartPage();
		int grpEndPage = handler.getGrpEndPage();

		for (int i = grpStartPage; i <= grpEndPage; i++) {
			System.out.print("[ " + i + "]   ");
		}

	}

}
