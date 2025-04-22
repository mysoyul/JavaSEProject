package chapter2.controlstmt;

import java.util.Calendar;
/**
 * ���糯¥�� ������ ���������� �����ͼ� ���ڿ� �����ϴ� Ŭ����
 * if ���� switch ������ �����Ͽ� �ۼ��غ�
 * @author ����
 * @version  ver1.0
 */
public class TestIf_Switch {
	/**
	 * main() �� ���డ���� �޼����̴�. 
	 * @param args  �������� ���ڿ�
	 */
	public static void main(String[] args) {
		//1. Calendar ��ü�� ����
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		if(dayOfWeek == 1) {
			System.out.println("�Ͽ���");
		}else if(dayOfWeek == 2) {
			System.out.println("������");
		}else if(dayOfWeek == 3) {
			System.out.println("ȭ����");
		}
		
		System.out.println("switch ���� ����");
		String dayStr = getDayOfWeek(dayOfWeek);
		System.out.println(dayStr);
	}//main
	
	/**
	 * int Ÿ���� ���ϰ��� �޾Ƽ� String Ÿ���� ���ڿ��� ��ȯ���ִ� �޼���
	 * @param day  intŸ���� ���ϰ�
	 * @return  StringŸ���� ���Ϲ��ڿ�
	 */
	public static String getDayOfWeek (int day) {
		//dayOfWeekStr�� ���ú��� ��, ���ú��� �޼��� ���ο� ����� ������ ����
		//���Ӻ����� �ݵ�� �����ϰ� ����Ҷ��� ������� �ʱ�ȭ�� �ʿ��ϴ�.
		String dayOfWeekStr = null;
		switch (day) {
		case 1:
			dayOfWeekStr="�Ͽ���";
			break;
		case 2:
			dayOfWeekStr="������";
			break;
		case 3:
			dayOfWeekStr="ȭ����";
			break;
		case 4:
			dayOfWeekStr="������";
			break;
		case 5:
			dayOfWeekStr="�����";
			break;
		case 6:
			dayOfWeekStr="�ݿ���";
			break;
		case 7:
			dayOfWeekStr="�����";
			break;
		default:
			break;
		}//switch
		
		return dayOfWeekStr;
	}
	
	

}


















