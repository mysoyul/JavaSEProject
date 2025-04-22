package chapter5.oop.myinteface;

public class LGRemoteTv implements IRemoteControl{

	@Override  //�������̵� ��Ģ�� ���״����� üũ�ϴ� ������̼�(annotation)
	public void powerOn() {
		System.out.println("TV ���� On!!");
	}

	@Override
	public void powerOff() {
		System.out.println("TV ���� Off!!");		
	}
	
	public String getBrandName() {
		return "LG TV";
	}
}
