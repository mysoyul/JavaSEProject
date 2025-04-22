package chapter5.oop.inheritance.test;

import chapter5.oop.inheritance.Employee;
import chapter5.oop.inheritance.Manager;
import chapter5.oop.inheritance.MereClerk;

public class TestEmployee {

	public static void main(String[] args) {
		//1. Manager ��ü ����
		//beforePolymorpism();
		afterPolymorphism();
	}
	//poly(�پ���) + morphism(����, �����ϴ�)
	//"One Interface , Multiple Implementation "
	public static void afterPolymorphism() {
		//Manager  m = new Employee(); (x) 
		
		Employee mgr = new Manager("��浿",100.0,"�λ��");
		//dynamic binding (Virtual Method Invocation)
		//������ Employee Ÿ���� ������ �ʰ�, ��Ÿ�ӿ� �����Ǵ� �������� ��ü�� ���� 
		//�޼��带 ȣ���ϴ� ��
		mgr.manageSalary(10.0);
		Manager mgr2 = (Manager)mgr;
		System.out.println(mgr2.getDept());
		
		((Manager)mgr).getDept();
		
		Employee clerk1 = new MereClerk("�Ѹ�", 90.0);
		Employee clerk2 = new MereClerk("��", 80.0);
		
		//Employee Ÿ���� �迭�� ����
		Employee[] emps = new Employee[3];
		emps[0] = new Manager("��浿",100.0,"�λ��");
		emps[1] = new MereClerk("�Ѹ�", 90.0);
		emps[2] = new MereClerk("��", 80.0);
		
		System.out.println("�޿� �λ��ϱ� �� ");
		for (int i = 0; i < emps.length; i++) {
			//emps[i]�� Manager ��ü�� ���� ������� instance ������ üũ�ϴ� ������
			if(emps[i] instanceof Manager) {
				Manager manager = (Manager)emps[i];
				System.out.print("������ : " + manager.getDept() + " ");
			}
			System.out.println(emps[i].getName() + " " + emps[i].getSalary());
			emps[i].manageSalary(10.0);
		}
		System.out.println("�޿� �λ��� ��");
		for(Employee emp : emps ) {
			System.out.println(emp.getName() + " "+emp.getSalary());
		}
	}
	
	//�������� �����ϱ� ��
	public static void beforePolymorpism() {
		Manager mgr1 = new Manager();
		
		System.out.println("�޿� �λ��ϱ� �� ");
		Manager mgr2 = new Manager("��浿",100.0);
		MereClerk clerk = new MereClerk("�Ѹ�", 90.0);
		MereClerk clerk2 = new MereClerk("��", 80.0);

		System.out.println(mgr2.getName()+ " " + mgr2.getSalary());
		System.out.println(clerk.getName() + " "+clerk.getSalary());
		System.out.println(clerk2.getName() + " "+clerk2.getSalary());
		
		mgr2.manageSalary(10.0);
		clerk.manageSalary(10.0);
		clerk2.manageSalary(10.0);
		
		System.out.println("�޿� �λ��� ��");
		System.out.println(mgr2.getName()+ " " + mgr2.getSalary());
		System.out.println(clerk.getName() + " "+clerk.getSalary());
		System.out.println(clerk2.getName() + " "+clerk2.getSalary());
		
		//Employee  emp = new Employee();		
	}
	

}





