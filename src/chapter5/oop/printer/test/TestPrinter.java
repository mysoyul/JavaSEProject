package chapter5.oop.printer.test;

import chapter5.oop.printer.DotPrinter;
import chapter5.oop.printer.InkjetPrinter;
import chapter5.oop.printer.LaserPrinter;
import chapter5.oop.printer.Printer;

public class TestPrinter {


	public static void main(String[] args) {
		//1.������ 3���� Printer ��ü�� �����Ͻÿ�. (���ʰ� �������� ������)
		DotPrinter dot = new DotPrinter("100");
		InkjetPrinter inkjet = new InkjetPrinter("200");
		LaserPrinter laser = new LaserPrinter("300");
		//1-1�� ��ü�� print() �޼��带 ȣ���Ѵ�.
		dot.print("Hello ");
		inkjet.print("Java");
		laser.print("choco");
		
		//2. 3���� Printer ��ü�� �����Ͻÿ� (������ Printer Ÿ������ )
		//One Interface, multiple Implementation (Polymorphism, ������)
		//Super Ŭ������ Ÿ���� ������ Sub ��ü�� �����Ͽ� �����ϴ� ���� �����ϴ�.
		Printer dot2 = new DotPrinter("101");
		Printer inkjet2 = new InkjetPrinter("102",100,0.5);
		//inkjet2 ��� ������  InkjetPrinter ��ü�� ������ ���� ������ üũ
		if(inkjet2 instanceof InkjetPrinter) {
			InkjetPrinter ink = (InkjetPrinter)inkjet2;
			ink.getInkCapacity();
		}
		Printer laser2 = new LaserPrinter("103",100,0.2);
		
		//Printer Ÿ���� �迭 ����
		Printer[] printers = new Printer[3];
		printers[0] = new DotPrinter("101");
		printers[1] = new InkjetPrinter("102",100,0.5);
		printers[2] = new LaserPrinter("103",100,0.2);
		
		String[] msg = {"Hello","Java","Choco"};
		
		for (int i = 0; i < printers.length; i++) {
			if(printers[i] instanceof InkjetPrinter) {
				InkjetPrinter inkjet3 = (InkjetPrinter)printers[i];
				System.out.println(">>>INKJET ������ "+inkjet3.getInkCapacity() + ": " + inkjet3.getInkReductionRate());
			}
			if(printers[i] instanceof LaserPrinter) {
				LaserPrinter laser3 = (LaserPrinter)printers[i];
				System.out.println(">>>LASER ������ " + laser3.getTonerCapacity() + " " + laser3.getTonerReductionRate());
			}
			printers[i].print(msg[i]);
		}
		
		
		
	}

}
