package workshop.animal.entity;

public class Cat extends Animal implements Pet {
	private String name;

	public Cat(String name) {
		super(4);
		this.name = name;
	}

	public Cat() {
		// super(4);
		this(""); // empty string 문자열을 인자로 넘겨주면서 앞의 생성자를 호출한다
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
		System.out.println("고양이는 장화를 신고 놀아요!!");
	}

	//@Override
	public void eat() {
		System.out.println("고양이는 생선을 먹어요!!");
	}

}
