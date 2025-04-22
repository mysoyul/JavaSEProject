package jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcPreparedStatement {
	//DB ��������
	static String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	//�����ID
	static String user = "hr";
	//�н�����
	static String pass = "hr";
	
	//Connetion
	Connection con = null;
	
	public JdbcPreparedStatement() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Class Loading ����");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Class Loading ����");
			e.printStackTrace();
		}
	}
	
	public Connection  getConnection(String url, String user, String pass) {
		try {
			con = DriverManager.getConnection(url,user,pass);
			System.out.println(con);
		} catch (SQLException e) {
			System.out.println("Connection ���� ���� " + e.getMessage());
			e.printStackTrace();
		}
		return con;
	}
	
//	public int deleteUsers() throws SQLException {
//		
//	}
	
	public int updateUsers() throws SQLException {
		String sql = "update users set age = ? where userid = ?";
		int updCnt = 0;
		PreparedStatement pstmt = null;
		
		//1. Connection ����
		con = getConnection(dbUrl, user, pass);
		//2.Statment ����
		pstmt = con.prepareStatement(sql);
		//3. ��ġǥ���ڿ� ���� SET
		pstmt.setInt(1, 25);
		pstmt.setString(2, "css3");
		//4. SQL�� ����
		updCnt = pstmt.executeUpdate();
		
		return updCnt;		
	}
	
	public  int  insertUsers () {
		String[] useridArr = {"css3","javascript","php" };
		String[] nameArr = {"������","�ڹٽ�ũ��","�ǿ�ġ��" };
		String[] passArr = {"c123","j123","p123" };
		
		int recCnt = 0;
		PreparedStatement  pstmt = null;
		String sql = "insert into users (userid,name,password,regdate) values (?,?,?,sysdate)";
		
		//1.Connection �����ض�
		con  = getConnection(dbUrl, user, pass);
		//2. PreparedStatement �����ض�
		try {
			pstmt = con.prepareStatement(sql);
			
			for(int i=0;i<useridArr.length;i++) {
			   //3.��ġǥ����(?)�� ���� SET �ض�
				pstmt.setString(1, useridArr[i]);  //userid
				pstmt.setString(2, nameArr[i]);  //name
				pstmt.setString(3, passArr[i]);  //password
			    //4. Insert SQL �� �����ض�	
				recCnt = pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return recCnt;
	}
	
	
	
	
	
	public static void main(String[] args) {
		JdbcPreparedStatement  test = new JdbcPreparedStatement();
		//int cnt = test.insertUsers();
		//System.out.println("Insert �� Row ���� : " + cnt + " ��");
		
		try {
			int updCnt = test.updateUsers();
			System.out.println("Update�� ���� : " + updCnt + "��");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
