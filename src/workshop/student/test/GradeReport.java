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
		list.add(new Student("ȫ�浿", 1, 80, 80, 70));
		list.add(new Student("�����", 2, 100, 100, 100));
		list.add(new Student("�ֿ켱", 3, 25, 32, 70));
		list.add(new Student("�輮��", 4, 57, 60, 65));
		list.add(new Student("�弮��", 5, 80, 80, 80));
		list.add(new Student("�Ű���", 6, 75, 68, 88));
		list.add(new Student("������", 7, 20, 55, 48));
	}
	public void printStudents(List<Student> list)
	{
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
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
		System.out.println("���������������������������������������л�   ����   ��Ȳ   ����Ʈ");
		System.out.println("==============================================================");
	}
}
