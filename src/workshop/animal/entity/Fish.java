package workshop.animal.entity;

public class Fish extends Animal implements Pet {
	private String name;
	
	public Fish() {
		super(0);
	}
	
	//@Override
	public void setName(String name) {
		this.name = name;
	}

	//@Override
	public String getName() {
		return name;
	}

	//@Override
	public void play() {
		System.out.println("물속에서 헤엄치며 놀아요!!");
	}

	//@Override
	public void eat() {
		System.out.println("물고기는 플랑크톤을 먹어요!!");
	}

	//@Override
	public void walk() {
		System.out.println("물고기는 걷지 않고, 헤엄쳐요");
	}

	
}
