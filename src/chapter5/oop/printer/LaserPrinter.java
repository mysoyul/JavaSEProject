package chapter5.oop.printer;

public class LaserPrinter extends Printer {
	private double tonerCapacity;		//��ũ�� �뷮
	private double tonerReductionRate;	//�پ��� ��ũ�Ǻ���
	
	public LaserPrinter(String id) {
		//this.id = id;
		super(id);  //�θ� Ŭ������ �����ڸ� ȣ����
		tonerCapacity = 200.0;
		tonerReductionRate = 0.3;
	}
	public LaserPrinter(String id, double tonerCapacity, double tonerReductionRate) {
		//this.id = id;
		this(id);  //���� Ŭ�������� �ٸ� �����ڸ� ȣ����
		this.tonerCapacity = tonerCapacity;
		this.tonerReductionRate = tonerReductionRate;
	}

	public double getTonerCapacity() {
		return tonerCapacity;
	}

	public double getTonerReductionRate() {
		return tonerReductionRate;
	}
	
	public void print(String msg) {
		if(isPrintable()) {
			System.out.println("������ ������� ����� �����մϴ�.");
			System.out.println(msg);
			System.out.println("������������� ����� �����մϴ�.");
			tonerCapacity -= tonerReductionRate;
		}else 
			alert();
	}//print
	
	public boolean isPrintable() {
		return (tonerCapacity - tonerReductionRate) >= 0;
	}//isPrintable
	
	public void alert() {
		System.out.println("��ʸ� ��ü�ؾ� �մϴ�. ���� ������ ��������~~~");
	}//alert
	
	
}
