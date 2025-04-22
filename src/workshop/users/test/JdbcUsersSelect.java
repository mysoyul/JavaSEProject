package workshop.users.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import workshop.users.entity.Users;

public class JdbcUsersSelect {
	//DB 접속정보
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	//사용자ID
	String user = "hr";
	//패스워드
	String pass = "hr";
			
	public JdbcUsersSelect() {
		//Driver class Loading
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("OK");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//생성자
	
	public Users  getUser(String userid) {
		String sql ="select * from users where userid = '"+userid+"'";
		System.out.println(sql);
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Users users = null;
		
		try {
			con = DriverManager.getConnection(dbUrl, user, pass);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				users = new Users(rs.getString("userid"),
						                      rs.getString("name"),
						                      rs.getInt("age"),
						                      rs.getString("password"),
						                      rs.getString("regdate"));
			}//while
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)rs.close();
				if(stmt != null)stmt.close();
				if(con != null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return users;
	}//getUser
	
	public static void main(String[] args) {
		JdbcUsersSelect  test = new JdbcUsersSelect();
		Users user = test.getUser("scott3");
		System.out.println(user.getUserid() + " " + user.getName() + " " + 
		user.getAge() + " " + user.getPassword() + " " + user.getRegdate());
	}
	

}
