package workshop.animal.test;

import workshop.animal.entity.Animal;
import workshop.animal.entity.Cat;
import workshop.animal.entity.Pet;

public class TestAnimal {
	
	public static void main(String[] args) {
		//Cat ��ü ����
		Cat cat1 = new Cat();
		cat1.setName("�����1");
		System.out.println(cat1.getName());
		cat1.play();
		cat1.eat();
		cat1.walk();
		
		Pet cat2 = new Cat();
		cat2.setName("�����2");
		System.out.println(cat2.getName());
		cat2.play();
		
		Animal cat3 = new Cat("�����3");
		cat3.eat();
		cat3.walk();
		if(cat3 instanceof Cat) {
			Cat cat4 = (Cat)cat3;
			System.out.println(cat4.getName());
		}
		
		
		
	}

}
