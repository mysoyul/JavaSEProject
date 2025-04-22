package chapter5.oop.inheritance;
/*
 * �߻�Ŭ������ ��ü�� ������ �� ����. Employee e = new Employee(); (x)
 * �߻�޼��带 �ϳ� �̻� ������ ������ ������ �߻�Ŭ������ �ȴ�.
 * Super Ŭ������ �޼��尡  �߻�޼����̸� , Sub Ŭ�������� �� �߻�޼��带 
 * �ݵ�� �������̵� �ؾ� �Ѵ�. 
 */
public abstract class Employee extends Object {

	private String name;
	protected double salary;

	public Employee() {
		super();
		System.out.println("Employee default constructor ȣ���");
	}

	public Employee(String name, double salary) {
		System.out.println("Employee constructor ȣ��� " + name);
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	//concrete method (body�� �ִ� �޼���)
	public double getSalary() {
		return salary;
	}
	//abstract method (�߻�޼��� : body�� ���� , ���� �� �޼���)
	public abstract void manageSalary(double rate);
	
}



