package acorn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class AcornDAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";

	// lib->ojdbc8.jar 두기 ( 오라클이 제공하는 데이터베이스연동 라이브러리)
	//
	public Connection dbcon() {

		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

	// 전체조회하기 selectAll
	// 데이터베이스 조회결과 -> ArrayList<Acorn>으로 만들고 반환하기

	public ArrayList<Acorn> selectAll() {
		ArrayList<Acorn> list = new ArrayList<>();

		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;

		String sql = "select * from acorntbl ";
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

			// 데이터베이스 조회결과 -> ArrayList<Acorn>으로 만들고 반환하기
			while (rs.next()) { // rs => 조회결과 하나의 행 정보를 가지고 있다
				System.out.println(rs.getString(1));

				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int point = rs.getInt(4);
				java.util.Date birth = rs.getDate(5); //

				// n(String id, String pw, String name, int point, Date birth) {

				Acorn acorn = new Acorn(id, pw, name, point, birth);
				list.add(acorn);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {  //close순서는 반대로 rs -> pst -> con
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			if (pst != null) {
				try {
					pst.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	

	public static void main(String[] args) {
		AcornDAO dao = new AcornDAO();
		Connection con  =dao.dbcon();
		System.out.println(con);  //  dkdkdkkdk@1212551
		if( con != null)  System.out.println("ok");

		ArrayList<Acorn>   list  =dao.selectAll();
		System.out.println(list);

//		Acorn acorn = new Acorn();
//		acorn.setId("test001");
//		acorn.setPw("4545");
//		acorn.setName("냠냠굿");
//		acorn.setPoint(30000);
//
//		// String -> Date
//
//		Date birthDate = null;
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			birthDate = df.parse("2000-10-10");
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		acorn.setBirth(birthDate);
//		
//		int r = dao.insert(acorn);
//		System.out.println(r);
//		
//	}
	
	}
}
