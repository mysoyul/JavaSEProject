package chapter2.controlstmt;

public class TestWhile {

	public static void main(String[] args) {
		
		//1 - 100  sum 
		int sum = 0;
		for (int i = 1; i <= 100 ; i++) {
			//sum = sum +i;
			sum += i;
		}
		System.out.println("1-100 �� :" + sum );
		
		//�ʱ�ġ
		int i = 0;
		sum = 0;
		//���ǽ�
		while(i <= 100) {
			sum += i;
			//����ġ
			i++;
		}
		System.out.println("while 1-100 �� :" + sum );
		
		//��ø�� For Loop
		for(int j=0; j<=10; j++) {
			for(int k=0;k<=j;k++) {
				System.out.print("*");
			}//for
			System.out.println("");
		}//for
		//j=0, k=0  *
		//j=1, k=0, k=1 **
		//j=2, k=0, k=1 k=2 ***
		//j=3, k=0, k=1 k=2 k=3  ****
		
		//while������ �����غ����� 
		System.out.println("��ø while");
		int j=0;
		int k=0;
		while(j <= 10) {
			k=0;
			while(k <= j) {
				System.out.print("*");
				k++;
			}//while
			System.out.println("");
			j++;			
		}//while
		
	}

}








