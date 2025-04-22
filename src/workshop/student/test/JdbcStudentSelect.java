package workshop.student.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import workshop.student.entity.Student;

public class JdbcStudentSelect {

	public static void main(String[] args) {
		//1. Driver Class Loading
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Class Loading 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Class Loading 실패");
			e.printStackTrace();
		}
		//DB 접속정보
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		//사용자ID
		String user = "hr";
		//패스워드
		String pass = "hr";
		//SQL문
		String sql = "select * from student where student_id=101";
		
		Connection  con = null;
		Statement  stmt = null;
		ResultSet rs = null;
		
		try {
			//Connection 생성
			con = DriverManager.getConnection(dbUrl, user, pass);
			System.out.println(con.getClass().getName());
			//Statement 생성
			stmt = con.createStatement();
			//SQL 실행
			rs = stmt.executeQuery(sql);
			//SQL문 결과 처리
			Student student = null;
			while(rs.next()) {
//				System.out.println(rs.getString("student_id") + " " + 
//			                                  rs.getString("student_name") + " " +
//			                                  rs.getString("kor"));
				student = new Student(rs.getString("student_name"), 
						                             rs.getInt("student_id"),
						                             rs.getInt("kor"), 
						                             rs.getInt("math"), 
						                             rs.getInt("eng"));
				System.out.println(student.getName() + " " + student.getStudentID());
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			//자원반납
			try {
				if(rs != null) rs.close();
				if(stmt !=null) stmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				System.out.println("자원반납 오류발생 :" + e.getMessage());
				e.printStackTrace();
			}

		}//finally
		
		

	}
	

}
