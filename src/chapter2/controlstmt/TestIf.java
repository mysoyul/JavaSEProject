package chapter2.controlstmt;

public class TestIf {


	public static void main(String[] args) {
		int num = 10;
		if(num > 0) {
			System.out.println("���");
		}else {
			System.out.println("����");
		}
		
		//���� �����ڸ� ���
		System.out.println(num > 0 ? "���" : "����");
		
		
	}//main

}//class
