package chapter2.controlstmt;

public class TestForLoop {
	public static void main(String[] args) {
		/*
		 * 1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�
		 */
		int sum = 0;
		for(int i=1; i<=10;i++) {
			if(i % 2 != 0  &&  i % 3 != 0) {
				sum += i;
			}
		}//
		System.out.println(sum);
		
	}
}
