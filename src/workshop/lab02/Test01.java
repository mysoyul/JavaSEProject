package workshop.lab02;

public class Test01 {
	public static void main(String[] args) {
		if(args != null) {
			//문자열을 숫자로 변환
			int maxNumber = Integer.parseInt(args[0]);
			System.out.println(" 1부터 "+maxNumber+" 까지 2 또는 3 또는 4의 배수가 아닌 수의 합");
			//메서드를 호출하여 결과를 출력함
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
