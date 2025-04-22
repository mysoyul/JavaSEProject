package chapter6.collections;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		addValues(list);
		printValues(list);
	}
	
	public static void  addValues(List<String> values) {
		values.add("��浿");
		values.add("�Ѹ�");
		values.add("����");
	}
	
	public static void printValues(List<String> values) {
		for(String value : values ) {
			System.out.println(value);
		}//for
	}
	
}
