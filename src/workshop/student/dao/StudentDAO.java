package workshop.student.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import workshop.student.entity.Student;

public class StudentDAO {
	SqlMapClient sqlMapClient;
	
	public StudentDAO() {
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	//Student 를 갱신하는 메서드
	public int updateStudent(Student stu) throws SQLException {
		int updCnt = 0;
		updCnt = sqlMapClient.update("updateStudent", stu);
		return updCnt;
	}
	
	//Student 를 등록하는 메서드
	public int insertStudent(Student stu) throws SQLException {
		int insCnt = 0;
		insCnt = sqlMapClient.update("insertStudent", stu);
		return insCnt;
	}//insertStudent
	
	
	//모든 Row를 조회하는 메서드
	public  List<Student>  getAllStudents() throws SQLException {
		List<Student>  stuList = null;
		
		stuList = sqlMapClient.queryForList("getAllStudent");
		return stuList;
	}//getAllStudents
	
	
	// 1건의 Row를 조회하는 메서드
	public Student getStudent(Integer studentId) throws SQLException {
		
		Student student = null;

		sqlMapClient.queryForObject("getStudent",studentId);
		return student;
	}// getStudent


}// class
