package exe;
public class Test3 {
	public static void main (String args [ ]) {
		ObjectOne one = new ObjectOne ( );
		one.number = 99;
		one.method (one);
		System.out.println (one.number);
	}
}
class ObjectOne {
	public int number;
	public void method (ObjectOne oo) {
		oo.number++;
	}
}
