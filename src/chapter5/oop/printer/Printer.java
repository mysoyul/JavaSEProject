package chapter5.oop.printer;
/*
 * �߻�޼��带 1�� �̻� ������ ������ �ݵ�� Ŭ������ �߻�Ŭ�����̾�� �Ѵ�.
 * �߻�Ŭ������ �Ϲݸ޼���(concrete method)�� 
 *   �߻�޼���(abstract method)�� �� �� ���� �� �ִ�.
 *  Printer p = new Printer(); (x)
 *  Printer p = new DotPrinter("100");
 *  Super Ŭ������ ����� �߻� �޼���� Sub Ŭ�������� 
 *    �ݵ�� �������̵�(overriding) �ؾ� �Ѵ�. 
 *  �������̵��� ��Ģ
 *  1. �޼����, ����Ÿ��, �ƱԸ�Ʈ ������Ÿ���� �ݵ�� ���ƾ� �Ѵ�. (�޼��弱��δ� ���ƾ���)
 *  2. ����(body)���� ������ �ٸ���.
 */
public abstract class Printer {

	private String id;

	public Printer() {
		super();
	}
	
	public Printer(String id) {
		this.id = id;
	}

	//concrete method (body�� �ִ� �޼���)
	public String getId() {
		return id;
	}
	
	//�߻�޼��� : body�� ����, ����θ� �ִ� �޼���, �̿ϼ��� �޼���
	public abstract void print(String msg);

}





