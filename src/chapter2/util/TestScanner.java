package chapter2.util;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		//1. Scanner ��ü ����
		//System.in : Ű����� ���� ���� �Է�
		Scanner scan = new Scanner(System.in);
		int kor = 0;
		int math = 0;
		String name = null;
		do {
			System.out.println("�̸��� �Է��ϼ���");
			name = scan.next();
			System.out.println("���� ������ �Է��ϼ���");
			kor = scan.nextInt();
			System.out.println("���� ������ �Է��ϼ���");
			math = scan.nextInt();
			break;
		}while(true);
		
		System.out.println("���� :" + name + " " + kor  + "-" + math);
		
	}

}
