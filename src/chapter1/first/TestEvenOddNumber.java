package chapter1.first;

public class TestEvenOddNumber {


	public static void main(String[] args) {
		int evenNumberSum = 0;	//¦��
		int oddNumberSum = 0;	//Ȧ��
		
		for (int i = 1; i <= 100; i++) {
			if(isEvenNumber(i)) {
				evenNumberSum += i;
			}else {
				oddNumberSum += i;
			}
			//¦��
//			if( i % 2 == 0 ) {
//				//evenNumberSum = evenNumberSum + i;
//				evenNumberSum += i;
//			}//if
//			//Ȧ��
//			if ( i % 2 != 0) {
//				oddNumberSum += i;
//			}//if
		}//for
		System.out.println("¦���� �� : " + evenNumberSum);
		System.out.println("Ȧ���� �� : " + oddNumberSum);
		
	}//main
	
	public static boolean isEvenNumber(int num) {
		boolean isEvenNumber = false;
		if(num % 2 == 0) {
			isEvenNumber = true;
		}
		return isEvenNumber;
	}
	
	
	
	
}//class
