//package TestPrac01;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.Date;
//
//public class AcornDAO {
//	
//	String driver ="oracle.jdbc.driver.OracleDriver";
//	String url="jdbc:oracle:thin:@localhost:1521:testdb";
//	String user="scott";  // system
//	String password="tiger"; //1234
//
//	public Connection dbcon() {
//		
//		Connection con = null;
//		
//		try {
//			Class.forName(driver);
//			con=DriverManager.getConnection(url, user, password);
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return con;
//	}
//	
//	public ArrayList<Acorn> selectAll(){
//		
//		//디비연결
//		Connection con = dbcon();
//		PreparedStatement pst = null;
//		ResultSet rs = null;
//		
//		
//		String sql="select * from acorntbl order by name";
//		ArrayList<Acorn> list = new ArrayList<>();
//		
//		try {
//			pst = con.prepareStatement(sql);
//			rs = pst.executeQuery();
//			
//			while(rs.next()) {
////				System.out.println(rs.getString(1));
//				String id = rs.getString(1);
//				String pw = rs.getString(2);
//				String name = rs.getString(3);
//				int point = Integer.parseInt(rs.getString(4));
//				java.util.Date birthday = rs.getDate(5);
//				
//				
////				Acorn(String id, String pw, String name, int point, Date birthday)
//				Acorn acorn = new Acorn(id, pw, name, point, birthday);
//				list.add(acorn);
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return list;
//		
//	}
//	
//	public static void main(String[] args) {
//		AcornDAO dao = new AcornDAO();
////		Connection con= dao.dbcon();
////		System.out.println("con");
////		
////		if(con!=null) {System.out.println("연결성공");}
//		ArrayList <Acorn> list = dao.selectAll();
//		System.out.println(list);
//		
//		
//	
//	}
//	
//}
