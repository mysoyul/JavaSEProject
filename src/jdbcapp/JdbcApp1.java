package jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApp1 {

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
		String sql = "select * from employees";
		
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
			while(rs.next()) {
				System.out.println(rs.getString("employee_id") + " " + 
			                                  rs.getString("first_name") + " " +
			                                  rs.getString("hire_date"));
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
