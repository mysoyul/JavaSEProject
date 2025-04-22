package chapter6.collections;

import java.util.ArrayList;
import java.util.List;

import chapter3.oop.MyDate;

public class TestMyDateArrayList {

	public static void main(String[] args) {
		//1. MyDate Ÿ���� ��ü�� ���� �� �ִ� ArrayList ��ü�� �����ϼ���
		List<MyDate> list = new ArrayList<>();
		//2. fillArrayList() �޼��带 ȣ���ϼ���
		fillArrayList(list);
		//3. printArrayList() �޼��带 ȣ���ϼ���
		printArrayList(list);
	}
	public static void fillArrayList(List<MyDate> list) {
		list.add(new MyDate(2013,8,1));
		list.add(new MyDate(2013,9,2));
	}
	public static void printArrayList(List<MyDate> list) {
		for (MyDate myDate : list) {
			System.out.println(myDate.getYear() + "-"+myDate.getMonth()+"-"+myDate.getDay());
		}
	}

}
