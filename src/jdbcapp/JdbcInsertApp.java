package jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * JDBC�� Auto Commit�� �����Ѵ�.
 * Auto Commit�� ������� ��������
 * 1. Auto Commit mode�� �����Ѵ�.
 *       con.setAutoCommit(false);
 * 2. executeUpdate() �޼��� ������
 *       con.commit();
 * 3. ���Ž� ������ �߻��� ���� catch ���� 
 *      con.rollback();             
 */
public class JdbcInsertApp {
	//DB ��������
	static String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	//�����ID
	static String user = "hr";
	//�н�����
	static String pass = "hr";
	
	public static void main(String[] args) {
		if(args.length != 3 ) {
			System.out.println("�ƱԸ�Ʈ�� �����ϴ�. !!!");
			System.exit(0);
		}
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		String password = args[2];
		
		//1. Driver class loading
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading Ok");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2. Connection ����
		Connection con = null;
		Statement stmt = null;
		
		try {
			con = DriverManager.getConnection(dbUrl, user, pass);
			//Auto Commit ����
			con.setAutoCommit(false);
			
			System.out.println(con);
			stmt = con.createStatement();
			
			StringBuilder sb = new StringBuilder();
			sb.append("update users set ")
			   .append("name='"+name+"', ")
			   .append("age="+age+", ")
			   .append("password='"+password+"' ")
			   .append("where userid = 'scott'");
			//String sql = "insert into users values ('scott4','��ı2',20,'abcd',sysdate)";
			String sql = sb.toString();
			System.out.println("UPDATE SQL �� :" + sql);
			int recCnt = stmt.executeUpdate(sql);
			//Commit ����
			con.commit();
			
			System.out.println("Insert �� ���ڵ� �Ǽ� : " + recCnt);
			
		} catch (SQLException e) {
			//Rollback ����
			try {
				con.rollback();
			} catch (SQLException e1) {
				System.out.println("Rollback ���� " + e1.getMessage());
				e1.printStackTrace();
			}
			
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//finally
		
	}

}
