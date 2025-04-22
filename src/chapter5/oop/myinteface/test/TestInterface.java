package chapter5.oop.myinteface.test;

import chapter5.oop.myinteface.IRemoteControl;
import chapter5.oop.myinteface.LGRemoteTv;

public class TestInterface {


	public static void main(String[] args) {
		//Interface�� �߻�Ŭ������ ���������� ��ü���� �� �� ����.
		//IRemoteControl rc = new IRemoteControl();
		System.out.println(IRemoteControl.ON);
		
		IRemoteControl rc = new LGRemoteTv(); //2��
		rc.powerOn();
		rc.powerOff();
		
		LGRemoteTv lgTv = new LGRemoteTv(); //3��
		System.out.println(lgTv.getBrandName());
		lgTv.powerOn();
		lgTv.powerOff();
		
		

	}

}
