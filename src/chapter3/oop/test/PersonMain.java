package chapter3.oop.test;

import chapter3.oop.Person;

public class PersonMain {

	public static void main(String[] args) {
		//PersonŸ���� ������ ���� �Ѱ���
		Person person = null;
		//person.age = 20;  //NullPointerException�߻�
//		person.fingerCount = 10;
//		System.out.println(person.fingerCount);
//		System.out.println(Person.fingerCount);
//		//Person��ü�� �����ؼ� person������ �ּҸ� ������
//		person = new Person();
//		person.age = 20;
//		person.name = "ȫ�浿";
//		person.height = 170;
//		person.weight = 70;
		//person.setFingerCount(10);
		System.out.println(person.getFingerCount() + " " + Person.getFingerCount());
		person = new Person();
		person.setName("ȫ�浿");
		person.setAge(20);
		person.setHeight(170);
		person.setWeight(70);
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getHeight());
		System.out.println(person.getWeight());
		
		//�ƱԸ�Ʈ �ִ� �����ڸ� ����ؼ� ��ü�� �����ϼ���
		Person person2 = new Person("�Ѹ�", 8, 135, 30);
		System.out.println(person2);
		System.out.println(person2.getName());
		System.out.println(person2.getAge());
		System.out.println(person2.getHeight());
		System.out.println(person2.getWeight());
		
//		Person person2 = new Person();
//		person2.name = "�Ѹ�";
//		person2.age = 8;
//		person2.height = 135;
//		person2.weight = 25;
//		System.out.println(person2.name);
//		System.out.println(person2.age);
//		System.out.println(person2.height);
//		System.out.println(person2.weight);
//		System.out.println(person2.fingerCount);
		
	}

}
