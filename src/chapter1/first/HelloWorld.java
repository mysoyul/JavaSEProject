package chapter1.first;

public class HelloWorld {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("�ֹι�ȣ�� �̸��� �ƱԸ�Ʈ�� ��������!!");
			System.exit(0); //0 :��������, -1 : ����������
		}
//		System.out.println(" Hello Java!!!");
		System.out.println("�ֹι�ȣ : " + args[0]);
		System.out.println("�ֹι�ȣ�ڹ�ȣù���� :" + args[0].charAt(6));
		checkGender(args);
		System.out.println(checkGender(args[0]));
		
		System.out.println("�̸� : " + args[1]);
	}//main
	
	public static String checkGender(String ssn) {
		String genderStr = null;
		char gender = ssn.charAt(6);
		if(gender == '1' || gender == '3') {
			genderStr = "����";
		}else if(gender == '2' || gender == '4' ) {
			genderStr = "����";
		}
		return genderStr;
	}
	
	
	public static void checkGender(String[] args) {
		char gender = args[0].charAt(6);
		if(gender == '1' || gender == '3') {
			System.out.println("����");
		}else if(gender == '2' || gender == '4' ) {
			System.out.println("����");
		}
	}//checkGender
}//class
