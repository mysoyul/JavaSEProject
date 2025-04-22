package chapter3.oop;

public class Person {
	/*
	 * instance ����(��ü����) : name, age, heigth, weight
	 *   : instance ������ ��ü�� ���� �����̹Ƿ� �ݵ�� ��ü�� ������ �Ŀ� ������ �� �ִ�.
	 * static ����(Ŭ��������) : fingerCount
	 *   : static ������ Ŭ������ ���� �����̹Ƿ� ��ü�� �������� �ʰ� Ŭ������.���� �� 
	 *     ������ �� �ִ�.
	 */
	//�̸�
	private String name;
	//����
	private int age;
	//Ű
	private int height;
	//������
	private int weight;
	//�հ�������
	static private int fingerCount;
	
	//default constructor
	public Person() {
		System.out.println("default constructor�� ȣ���");
	}
	
	public Person(String name, int age, int height, int weight) {
		System.out.println("�ƱԸ�Ʈ�� �ִ� �����ڰ� ȣ���");
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	//static initializer
	static {
		System.out.println("static initializer ȣ���");
		fingerCount = 100;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public static int getFingerCount() {
		return fingerCount;
	}
	public static void setFingerCount(int fingerCount) {
		Person.fingerCount = fingerCount;
	}
	
	
}
