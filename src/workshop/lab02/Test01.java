package workshop.lab02;

public class Test01 {
	public static void main(String[] args) {
		if(args != null) {
			//���ڿ��� ���ڷ� ��ȯ
			int maxNumber = Integer.parseInt(args[0]);
			System.out.println(" 1���� "+maxNumber+" ���� 2 �Ǵ� 3 �Ǵ� 4�� ����� �ƴ� ���� ��");
			//�޼��带 ȣ���Ͽ� ����� �����
			System.out.println(getNumber(maxNumber));
			
		}
	}
	
	public static int getNumber(int maxNumber) {
		int sum = 0;
		for (int i = 1; i <= maxNumber; i++) {
			if((i % 2 != 0) && (i % 3 != 0) && (i % 3 != 0)) {
				sum += i;
			}
		}
		return sum;
	}
}
