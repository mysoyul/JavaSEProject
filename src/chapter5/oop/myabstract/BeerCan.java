package chapter5.oop.myabstract;

public class BeerCan extends EmptyCan {

	@Override
	public void printContent() {
		System.out.println("����� �Դϴ�.");
	}

	@Override
	public void printName() {
		System.out.println("OB ���� �Դϴ�.");
	}
	
}
