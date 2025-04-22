package chapter5.oop.printer;

public class InkjetPrinter extends Printer {
	private double inkCapacity;		//��ũ�� �뷮
	private double inkReductionRate;	//�پ��� ��ũ�Ǻ���
	
	public InkjetPrinter(String id) {
		//this.id = id;
		super(id);
		inkCapacity = 100.0;
		inkReductionRate = 0.2;
	}
	public InkjetPrinter(String id, double inkCapacity, double inkReductionRate) {
		//this.id = id;
		this(id);
		this.inkCapacity = inkCapacity;
		this.inkReductionRate = inkReductionRate;
	}

	public double getInkCapacity() {
		return inkCapacity;
	}

	public double getInkReductionRate() {
		return inkReductionRate;
	}
	
	public void print(String msg) {
		if(isPrintable()) {
			System.out.println("��ũ�� ������� ����� �����մϴ�.");
			System.out.println(msg);
			System.out.println("��ũ��������� ����� �����մϴ�.");
			inkCapacity -= inkReductionRate;
		}else 
			alert();
	}//print
	
	public boolean isPrintable() {
		return (inkCapacity - inkReductionRate) >= 0;
	}//isPrintable
	
	public void alert() {
		System.out.println("��ũ�� �����մϴ�. ���� ������ ��������~~~");
	}//alert
	
	
}
