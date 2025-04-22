package chapter5.oop.inheritance;
//������
public class Manager extends Employee {
	String dept;
	
	public Manager() {
		//super();
		System.out.println("Manager default constuctor ȣ���");
	}

	public Manager(String name, double salary) {
//		this.name = name;
//		this.salary = salary;
		super(name, salary);
		System.out.println("Manager ������ ȣ��� " + name );
	}
	
	public Manager(String name, double salary, String dept) {
//		this.name = name;
//		this.salary = salary;
		this(name,salary);
		this.dept = dept;
		System.out.println("Manager ������ ȣ��� " + dept);
	}

	public String getDept() {
		return dept;
	}
	//�޿����
	//@Override
	/*
	 * @Override ������̼��� ����
	 * �������̵� ��Ģ(����δ� ����, �����θ� �ٸ�)�� �ؼ� �ߴ��� üũ�� �ִ� ����
	 */
	public void manageSalary(double rate) {
		super.salary = salary + salary*(rate/100);
		salary += 20; //20���� �߰��� ����
	}
	
}
