package chapter1.first;

import java.util.Scanner;

public class MyCalculatorUsingScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int Integer.parseInt(String str)
		int num1 = 0;
		int num2 = 0;
		
		while(true) {
			System.out.println("ù��° ���ڸ� �Է��ϼ���!!");
			num1 = scan.nextInt();
			System.out.println("�ι�° ���ڸ� �Է��ϼ���!!");
			num2 = scan.nextInt();
			break;
		}
		//3. ���ϱ� ������ �ϴ� �޼��带 ȣ���Ѵ�.
		System.out.println(num1 + " : " +  num2);
		int result = 0;
		result = add(num1, num2);
		System.out.println("���ϱ� ���� ��� : " + result);
		result = substract(num1, num2);
		System.out.println("���� ���� ��� : " + result);
		result = remainder(num1, num2);
		System.out.println("������ ���� ��� :" + result);
	}//main
	
	public static int add(int op1, int op2) {
		return op1 + op2;
	}
	public static int substract(int op1, int op2) {
		return op1 - op2;
	}
	public static int multiply(int op1, int op2) {
		return op1 * op2;
	}
	public static int divide(int op1, int op2) {
		return op1 / op2;
	}
	public static int remainder(int op1, int op2) {
		return op1 % op2;
	}
	
	

}
