package exe;

public class Test2 {
   int num = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String ("Hello");
		String str2 = new String ("Hello");
		String str3 = "Hello";
		String str4 = str1;
		if (str1 == str2) {  //�ּҰ� ������?
			System.out.println ("one");
		} else if (str2 == str3) {
			System.out.println ("two");
		} else if (str1.equals (str3)) { //���ڿ����� ����?
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
		//JDK7.0 ���� ���ʹ� Switch ������ String Ÿ���� ����� �� �ִ�.
		String s = "b";
		switch (s) {
		case "a":
			System.out.println("A ��µ�");
			break;
		case "b":
			System.out.println("B ��µ�");
			break;
		default:
			break;
		}
		

	}//main

}//class
