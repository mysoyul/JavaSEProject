package workshop.student.test;

import java.util.ArrayList;
import java.util.List;

import workshop.student.entity.Student;


public class GradeReport {
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		GradeReport g = new GradeReport();
		
		g.printTitle();
		g.fillStudents(list);
		g.printStudents(list);
	}
	public void fillStudents(List<Student> list)
	{
		list.add(new Student("홍길동", 1, 80, 80, 70));
		list.add(new Student("서평원", 2, 100, 100, 100));
		list.add(new Student("주우선", 3, 25, 32, 70));
		list.add(new Student("김석우", 4, 57, 60, 65));
		list.add(new Student("장석우", 5, 80, 80, 80));
		list.add(new Student("신가람", 6, 75, 68, 88));
		list.add(new Student("박종현", 7, 20, 55, 48));
	}
	public void printStudents(List<Student> list)
	{
		System.out.println("번호\t이름\t국어\t수학\t영어\t총점\t평균\t학점");
		for (Student s : list) {
			System.out.println(s.getStudentID()+"\t"+s.getName()+"\t"+
								s.getKor()+"\t"+s.getMath()+"\t"+
								s.getEng()+"\t"+s.getSum()+"\t"+
								s.getAvg()+"\t"+s.getGrade());
		}
	}
	public void printTitle()
	{
		System.out.println("==============================================================");
		System.out.println("　　　　　　　　　　　　　　　　　　　학생   성적   현황   리스트");
		System.out.println("==============================================================");
	}
}
