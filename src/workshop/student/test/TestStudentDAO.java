package workshop.student.test;

import java.sql.SQLException;
import java.util.List;

import workshop.student.dao.StudentDAO;
import workshop.student.entity.Student;

public class TestStudentDAO {

	public static void main(String[] args) {
		//StudentDAO ��ü���� �ϼ���!!
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
			
			//Student ��ü����
			Student student = new Student();
			//Student ��ü�� �ν������� ������ ���� SET
			student.setStudentID(200);
			student.setName("�ڱ浿");
			student.setKor(20);
			student.setMath(10);
			student.setEng(30);
			
			//StudentDAO Ŭ������ ��ϸ޼��� ȣ��
			//int insCnt = dao.insertStudent(student);
			//System.out.println("��ϵ� �Ǽ� :" + insCnt);
			
			//StudentDAO �� ���Ÿ޼��� ȣ��
//			int updCnt = dao.updateStudent(student);
//			System.out.println("���ŵ� �Ǽ� : " + updCnt);
			
		} catch (SQLException e) {
			System.out.println("��ȸ �� ���� �߻� : " + e.getMessage());
			e.printStackTrace();
		}
	}

}
