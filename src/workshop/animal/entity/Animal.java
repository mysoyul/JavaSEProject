package workshop.animal.entity;

public abstract class Animal {
	protected int legs;
	
	//생성자
	protected  Animal(int legs) {
		this.legs = legs;
	}
	
	public abstract void eat();
	
	public void walk() {
		System.out.println("동물은 "+legs +"발로 걷는다.");
	}
	
}
