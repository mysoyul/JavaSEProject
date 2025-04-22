package exe;

public class Test {
	public static void main(String[] args) {
		                                       //0123456
		String str1 = new String ("yesterday");
		int i = str1.indexOf ('d');
		System.out.println(i + " " + str1.length());
		String str2 = str1.substring (i, str1.length( ));
		System.out.println (str2);
		String str3 = str1.substring(0, 3);
		str3 = str1.substring(6);
		System.out.println(str3);
		
		 
	}
}
