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
			System.out.println("Driver Class Loading ����");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Class Loading ����");
			e.printStackTrace();
		}
		//DB ��������
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		//�����ID
		String user = "hr";
		//�н�����
		String pass = "hr";
		//SQL��
		String sql = "select * from student where student_id=101";
		
		Connection  con = null;
		Statement  stmt = null;
		ResultSet rs = null;
		
		try {
			//Connection ����
			con = DriverManager.getConnection(dbUrl, user, pass);
			System.out.println(con.getClass().getName());
			//Statement ����
			stmt = con.createStatement();
			//SQL ����
			rs = stmt.executeQuery(sql);
			//SQL�� ��� ó��
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
			//�ڿ��ݳ�
			try {
				if(rs != null) rs.close();
				if(stmt !=null) stmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				System.out.println("�ڿ��ݳ� �����߻� :" + e.getMessage());
				e.printStackTrace();
			}

		}//finally
		
		

	}
	

}
