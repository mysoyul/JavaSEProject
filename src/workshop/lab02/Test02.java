package workshop.lab02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//1. Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		String name = null;
		int kor = 0;
		int math = 0;
		int eng = 0;
		do {
			System.out.println("�̸��� �Է��ϼ���");
			name = scan.next();
			System.out.println("���������� �Է��ϼ���");
			kor = scan.nextInt();
			System.out.println("���������� �Է��ϼ���");
			math = scan.nextInt();
			System.out.println("���������� �Է��ϼ���");
			eng = scan.nextInt();
			break;
		} while (true);
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + getSum(kor, math, eng));
		int avg = getAvg(kor, math, eng);
		System.out.println("��� : " + avg);
		System.out.println("���� : " + getGrade(avg));

	}//main
	//����
	public static int getSum(int k, int m, int e) {
		return k + m + e;
	}
	public static int getAvg(int k, int m, int e) {
		return getSum(k,m,e) / 3;
	}
	public static String getGrade(int avg) {
		String grade = null;
		switch (avg/10) {
			case 10:grade = "A"; break;
			case  9:grade = "A"; break;
			case  8:grade = "B"; break;
			case  7:grade = "C"; break;
			case  6:grade = "D"; break;
			default:grade = "F"; break;
		}
		return grade;
	}
	

}










