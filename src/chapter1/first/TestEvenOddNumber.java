package chapter1.first;

public class TestEvenOddNumber {


	public static void main(String[] args) {
		int evenNumberSum = 0;	//Â¦¼ö
		int oddNumberSum = 0;	//È¦¼ö
		
		for (int i = 1; i <= 100; i++) {
			if(isEvenNumber(i)) {
				evenNumberSum += i;
			}else {
				oddNumberSum += i;
			}
			//Â¦¼ö
//			if( i % 2 == 0 ) {
//				//evenNumberSum = evenNumberSum + i;
//				evenNumberSum += i;
//			}//if
//			//È¦¼ö
//			if ( i % 2 != 0) {
//				oddNumberSum += i;
//			}//if
		}//for
		System.out.println("Â¦¼öÀÇ ÇÕ : " + evenNumberSum);
		System.out.println("È¦¼öÀÇ ÇÕ : " + oddNumberSum);
		
	}//main
	
	public static boolean isEvenNumber(int num) {
		boolean isEvenNumber = false;
		if(num % 2 == 0) {
			isEvenNumber = true;
		}
		return isEvenNumber;
	}
	
	
	
	
}//class
