package chapter5.oop.inheritance;
//����
public class MereClerk extends Employee {
	public MereClerk() {
		System.out.println("MereClerk default constructor ȣ���");
	}

	public MereClerk(String name, double salary) {
//		this.name = name;
//		this.salary = salary;
//		System.out.println("");   super()�� ������ ù��° �ٿ� �;� �Ѵ�.
		super(name,salary);
		System.out.println("MereClerk constructor ȣ��� " + name);
	}
	
	//�޿����
	public void manageSalary(double rate) {
		salary = salary + salary*(rate/100);
	}
	
}
