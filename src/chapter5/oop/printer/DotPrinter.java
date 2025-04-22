package chapter5.oop.printer;

public class DotPrinter extends Printer  {
	public DotPrinter(String id) {
		//this.id = id;
		super(id);	//Printer Ŭ������ �����ڸ� ȣ����
	}
	public void print(String msg) {
		if(isPrintable()) {
			System.out.println("��Ʈ ������� ����� �����մϴ�.");
			System.out.println(msg);
			System.out.println("��Ʈ������� ����� �����մϴ�.");
		}else 
			alert();
	}
	
	public boolean isPrintable() {
		return true;
	}
	
	public void alert() {
		System.out.println("");
	}
	
}
