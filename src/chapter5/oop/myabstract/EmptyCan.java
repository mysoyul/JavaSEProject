package chapter5.oop.myabstract;

/*
 * �߻�Ŭ������ �߻�޼��常 ���� �� �ִ�.(X)
 * �߻�Ŭ������ �߻�޼���� �Ϲ� �޼��� �� �� ���� �� �ִ�.(O)
 * �������̽��� �߻�޼��常 ���� �� �ִ�.(O)
 * �������̽��� �߻�޼���� �Ϲ� �޼��� �� �� ���� �� �ִ�.(X)
 * Super Ŭ������ �߻�޼��带 SubŬ�������� �������� �ʾƵ� �ȴ�.(X)
 * Super Ŭ������ �߻�޼���� SubŬ�������� �ݵ�� �����ؾ� �Ѵ�.(O)
 * �߻�Ŭ������ ��ü�� ������ �� �ִ�.(X)
 * �߻�Ŭ������ �ݵ�� ����ض� (O)
 */
public abstract class EmptyCan {
	public abstract void printContent();
	public abstract void printName();
	
	public void sayHello() {
		
	}
}
