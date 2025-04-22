package workshop.users.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import workshop.student.entity.Student;
import workshop.users.entity.Users;

public class UsersDAO {
	public UsersDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("loading OK");
		} catch (ClassNotFoundException e) {
			System.out.println("loading Fail");
			e.printStackTrace();
		}
	}

	public Connection getConnection() throws SQLException {
		String dburl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String dbuser = "hr";
		String dbpass = "hr";
		return DriverManager.getConnection(dburl, dbuser, dbpass);
	}
	//��� Row�� ��ȸ�ϴ� �޼���
	public  List<Users>  getAllStudents() throws SQLException {
		String sql = "select * from users order by userid";
		List<Users>  userList = new ArrayList<>();
		Users user = null;
		
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			user = new Users(rs.getString("userid"),
										rs.getString("name"),
										rs.getInt("age"),
										rs.getString("password"),
										rs.getString("regdate"));
			userList.add(user);
		}
		
		return userList;
	}//getAllStudents
	
	
	// 1���� Row�� ��ȸ�ϴ� �޼���
	public Users getUsers(String userid) throws SQLException {
		String sql = "select * from users where userid = ?";
		Users user = null;

		// 1.Connection ��������
		Connection con = getConnection();
		// 2. PreparedStatement ����
		PreparedStatement pstmt = con.prepareStatement(sql);
		// 3. ? �� ���� Set
		pstmt.setString(1, userid);
		// 4. SQL���� �����ϰ� ����� ResultSet �� �޴´�
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			user = new Users(rs.getString("userid"),
					                    rs.getString("name"),
					                    rs.getInt("age"),
					                    rs.getString("password"),
					                    rs.getString("regdate"));
		}
		
		close(con, pstmt, rs);
		
		return user;
	}// getStudent

	// ��ȸ ���� close()
	public void close(Connection con, Statement stmt, ResultSet rs)
			throws SQLException {
		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (con != null)
			con.close();
	}

	// ���� ���� close()
	public void close(Connection con, Statement stmt) throws SQLException {
		if (stmt != null)
			stmt.close();
		if (con != null)
			con.close();
	}

}// class
