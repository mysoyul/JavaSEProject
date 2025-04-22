package workshop.student.test;

import java.sql.SQLException;
import java.util.List;

import workshop.student.dao.StudentDAO;
import workshop.student.entity.Student;

public class TestStudentDAO {

	public static void main(String[] args) {
		//StudentDAO 객체생성 하세요!!
		StudentDAO dao = new StudentDAO();
//		try {
//			System.out.println(dao.getConnection());
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			Student stu = dao.getStudent(103);
			System.out.println(stu);
			System.out.println(stu.getName());
			
			List<Student> list = dao.getAllStudents();
			for(Student stu2 : list ) {
				System.out.println(stu2.toString());
			}
			
			//Student 객체생성
			Student student = new Student();
			//Student 객체의 인스변수에 각각의 값을 SET
			student.setStudentID(200);
			student.setName("박길동");
			student.setKor(20);
			student.setMath(10);
			student.setEng(30);
			
			//StudentDAO 클래스의 등록메서드 호출
			//int insCnt = dao.insertStudent(student);
			//System.out.println("등록된 건수 :" + insCnt);
			
			//StudentDAO 의 갱신메서드 호출
//			int updCnt = dao.updateStudent(student);
//			System.out.println("갱신된 건수 : " + updCnt);
			
		} catch (SQLException e) {
			System.out.println("조회 중 에러 발생 : " + e.getMessage());
			e.printStackTrace();
		}
	}

}
