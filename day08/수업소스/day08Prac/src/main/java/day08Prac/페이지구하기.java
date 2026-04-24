package day08Prac;

public class 페이지구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		
		//필요한 변수 
		 int pageSize=4;  //글의 목록 수   (정하는 것) 
		 int grpSize= 5; // [1] [2] [3] [4]  (정하는 것)
		 int totRecords=37;   // 구해와야 하는것 디비에 있음 
		 int currentPage=6;
		 
		 
		 //[1] [2] [3] [4]   =>1그룹 아니면		 
		 //[5] [6] [7] [8]   =>2그룹
		 
		 //구해야 하는 값
		 int totalPage; // 전체페이지 수 
		 int currentGrp;  //현재페이지가 속한 그룹구하기
		 int grpStartPage;// 그룹의 시작구하기
		 int grpEndPage; //그룹의 끝구하기
		 
		 
		 
		 //1)	
		 //전체페이지수 구하기
		 
		 int remain  = totRecords % pageSize;   // 나머지 구하기 
		 
		 //나머지가 없으면
		 if( remain==0) {
			 totalPage=  totRecords /pageSize;  // 정수  /정수  => 정수			 
		 }else {
			 totalPage= ( totRecords /pageSize) +1;    // 46 / 5 => 9+1 =>10
		 }
		 
		 
		 System.out.println( totalPage);
		 
		 
		 
		 //2) 현재페이지가 속한 그룹 구하기  (현재그룹 구하기)
		 
		 
		 // [1] [2] [3] [4]
		 // [5] [6] [7] [8]
		 // [9] [10]
		 
		 int remain2 = currentPage % grpSize;
		 
		 
		 if( remain2 ==0) {
			 currentGrp =  currentPage/grpSize;
		 }else {
			 currentGrp =  (currentPage/grpSize)+1;
		 }
		 
		 System.out.println( currentGrp);
		 
		
		 //그룹의 사이즈  :4
		 //현재그룹의 시작   =>1
		 //현재그룹의 끝   => 4
		 
		 // 1그룹이라면 =>  [1] [2] [3] [4]
		 // 2그룹이라면 =>  [5] [6] [7] [8]
		 
		 grpStartPage = (currentGrp-1)*grpSize  +1;
		 grpEndPage  = currentGrp *grpSize;
		 
		 
		 
		 //현재그룹의 마지막을 확인하기
		 //토탈페이지보다 큰지 확인하기 
		 
		 if(grpEndPage > totalPage) {   //8     >  6
			 grpEndPage=totalPage;
		 }
		 
		 //결과출력하기
		 System.out.println("total 페이지" +totalPage);
		 System.out.println("현재그룹" +currentGrp);
		 System.out.println("현재그룹 시작" +grpStartPage);
		 System.out.println("현재그룹 마지막" +grpEndPage);		 
		 
		 
		 //페이징번호 출력하기		 
		 for( int i=grpStartPage ; i<=grpEndPage ; i++) {
			 System.out.print("["+ i+"]");
		 }
		 
		 
		 

	}

}
