package chapter1.first;

public class MyCalcurator {

	public static void main(String[] args) {
		//1. �ƱԸ�Ʈ�� length �� üũ�ؼ�  length != 2 ��  ���α׷� ����
		if(args.length != 2) {
			System.out.println("�ƱԸ�Ʈ�� �ΰ��� ���ڸ� �Է��ؾ� �մϴ�.");
			System.exit(0);
		}
		//2. String Ÿ���� argument 2���� int Ÿ������ ��ȯ�Ѵ�. 
		//int Integer.parseInt(String str)
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
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
