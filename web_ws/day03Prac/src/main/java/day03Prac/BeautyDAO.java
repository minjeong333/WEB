package day03Prac;
 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 
//BeautyDAO에서는 쿼리의 의도를 적는 것이 핵심!!
public class BeautyDAO {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	
	public Connection dbcon() {		 
		Connection con = null;
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			if( con != null) System.out.println( "ok");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;		 	
	}
	
	
	 
	
	public ArrayList<Beauty> selectAll(){	
		//연결
		Connection con  =dbcon();
		
		
		//★하이라이트★
		//sql
		String sql = "SELECT C.NAME AS 고객명, "
		           + "       P.NAME AS 주문상품, "
		           + "       I.QUANTITY AS 주문수량, "
		           + "       TO_CHAR(I.UNIT_PRICE, '999,999') AS 가격, "
		           + "       O.STATUS AS ORDER_STATUS, "
		           + "       D.STATUS AS DELIVER_STATUS "
		           + "FROM CUSTOMER C "
		           + "JOIN ORDERS O      ON C.CUSTOMER_ID = O.CUSTOMER_ID "
		           + "JOIN ORDER_ITEM I  ON O.ORDER_ID = I.ORDER_ID "
		           + "JOIN PRODUCT P     ON I.PRODUCT_ID = P.PRODUCT_ID "
		           + "LEFT JOIN DELIVERY D ON O.ORDER_ID = D.ORDER_ID";	//배송정보가 없어도 주문내역이 나오게 LEFT JOIN으로 수정	
																		//그냥 JOIN을 쓰면 하나라도 빈값이 있으면 전체 결과가 안나옴 주의 !!
		
		//sql실행
		PreparedStatement pst=null;
		ResultSet rs =null;
		
		ArrayList<Beauty> list =new ArrayList<>();
		try {
			pst=con.prepareStatement(sql);
			rs =pst.executeQuery();
			
			while( rs.next()) {
				String  name = rs.getString(1);
				String  product = rs.getString(2);
				int  quantity = rs.getInt(3);
				String  price  = rs.getString(4);
				String  orderStatus = rs.getString(5);
				String  deliverStatus = rs.getString(6);
				
				Beauty c = new Beauty( name, product, quantity, price, orderStatus, deliverStatus);
				list.add(c);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		//해제
		close(rs,pst, con);
		return list;		
	}
	
	 
	 
	 
	
	public void close( AutoCloseable ...a) {
		for( AutoCloseable  item : a) {
		   try {
			item.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
		
	}

 
	public static void main(String[] args) {
		BeautyDAO dao = new BeautyDAO();
		
		ArrayList<Beauty> list  =dao.selectAll();
		System.out.println( list);
		 
	}

}
