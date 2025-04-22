package workshop.lab02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//1. Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		String name = null;
		int kor = 0;
		int math = 0;
		int eng = 0;
		do {
			System.out.println("이름을 입력하세요");
			name = scan.next();
			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();
			break;
		} while (true);
		
		System.out.println("이름 : " + name);
		System.out.println("총합 : " + getSum(kor, math, eng));
		int avg = getAvg(kor, math, eng);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + getGrade(avg));

	}//main
	//총합
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










