package exe;

public class Test2 {
   int num = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String ("Hello");
		String str2 = new String ("Hello");
		String str3 = "Hello";
		String str4 = str1;
		if (str1 == str2) {  //주소가 같으냐?
			System.out.println ("one");
		} else if (str2 == str3) {
			System.out.println ("two");
		} else if (str1.equals (str3)) { //문자열값이 같니?
			if (str1 == str4) {
				System.out.println ("three");
			} else {
				System.out.println ("four");
			}
		}

		int i = 2;  //byte, short, int
		switch (i) {
			case 2:System.out.println ("two");//break;
			case 2 + 1:System.out.println ("three");break;
			default:System.out.println (i);	break;
		}
		//JDK7.0 버전 부터는 Switch 구문에 String 타입을 사용할 수 있다.
		String s = "b";
		switch (s) {
		case "a":
			System.out.println("A 출력됨");
			break;
		case "b":
			System.out.println("B 출력됨");
			break;
		default:
			break;
		}
		

	}//main

}//class
