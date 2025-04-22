package chapter6.collections;

import java.util.ArrayList;
import java.util.List;

import chapter3.oop.MyDate;

public class TestArrayList {


	public static void main(String[] args) {
		arrayList1_4();
		arrayList1_4_2();
		arrayList5_0();
		arrayList5_2();
		myDateArrayList();
	}//main
	
	public static void myDateArrayList() {
		//MyDate Ÿ���� ��ü���� ���� �� �ִ� ArrayList �� ����
		List<MyDate> list = new ArrayList<MyDate>();
		
		list.add(new MyDate(2013, 7, 23));
		list.add(new MyDate(2013, 8, 15));
		list.add(new MyDate(2013, 8, 26));
		
		for(MyDate mydate : list) {
			System.out.println(mydate.getYear()+"-"+mydate.getMonth()+"-"+mydate.getDay());
		}//for
		
	}
	
	
	public static void arrayList5_2() {
		//100 ~ 500 ������ ���� ���� Integer Ÿ���� ��ü�� ArrayList �� �����ϼ���
		// Enhanced For Loop �� ����ϼ���
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(100));
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		for(Integer value : list ) {
			System.out.println(value);
		}
		
	}
	
	public static void arrayList5_0() {
		//1. String Ÿ���� ��ü�� ���� �� �ִ� ArrayList ��ü ����
		ArrayList<String> list = new ArrayList<>();
		list.add("Java5");
		String val = list.get(0);
		System.out.println(val);
		//list.add(new Integer(100));
		//String Ÿ���� ��ü�� ���� �� �����Ƿ�, Integer Ÿ���� ��ü�� ������ ������ ������ �߻���
		list.add("CSS3");
		list.add("JQuery");
		list.add("JavaScript");
		String value = null;
		for (int i = 0; i < list.size(); i++) {
			value = list.get(i);
		}
		System.out.println("forEach ����");
		for(String val2 : list) {
			System.out.println(val2);
		}
		
		
	}
	public static void arrayList1_4_2() {
		//1. ArrayList ��ü ����
		//2. add() ���
		//3. get(), size() ���
	}
	
	//1.4 ���� ����
	public static void  arrayList1_4() {
		//1. ArrayList ��ü ����
		ArrayList list = new ArrayList();
		//2. add() �޼��带 �̿��ؼ� ��ü�� ����
		list.add(new String("Java"));
		System.out.println(list.size());
		String str = (String)list.get(0);
		System.out.println(str);
		list.add("JSP");
		list.add("JavaScript");
		list.add("Java");
		list.add("HTML5");
		//list.add(new Integer(100));  
		//String�� �ٸ� Integer Ÿ���� add �Ͽ��� ������ ������ �߻����� �ʴ´�.
		//get �Ҷ� String Ÿ������ ����ȯ�� �Ͽ��ٸ� ClassCastException �� ��Ÿ�ӿ����� �߻���
		
		String value = null;
		for(int i=0;i<list.size();i++) {
			value = (String)list.get(i);
			System.out.println(value);
		}
	}
	
	
}
