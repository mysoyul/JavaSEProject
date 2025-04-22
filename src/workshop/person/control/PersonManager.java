package workshop.person.control;

import workshop.person.entity.PersonEntity;

public class PersonManager {

	public static void main(String[] args) {
		//PersonEntity 배열생성
		PersonEntity[] persons = new PersonEntity[3];
		
		PersonManager mgr = new PersonManager();
		mgr.fillPersons(persons);
		mgr.showPerson(persons);
		System.out.println(mgr.findbyGender(persons, '남'));
		mgr.showPerson(persons, "김하늘");
		
	}//main
	public void showPerson(PersonEntity[] persons, String name) {
		for (PersonEntity person : persons) {
			if(person.getName().equals(name)) {
				System.out.println("[이름] " + person.getName());
				System.out.println("[성별] " + person.getGender());
				System.out.println("[전화번호] " + person.getPhone());
				break;
			}
		}
	}
	public int findbyGender(PersonEntity[] persons, char gender) {
		int genderCnt = 0;
		for (PersonEntity person : persons) {
			if(person.getGender() == gender) {
				genderCnt++;
			}
		}
		return genderCnt;
	}
	public void fillPersons(PersonEntity[] persons) {
		persons[0] = new PersonEntity("이성호","7212121028102", "인천 계양구", "032-392-2932");
		persons[1] = new PersonEntity("김하늘","7302132363217", "서울 강동구", "02-362-1932");
		persons[2] = new PersonEntity("이미숙","7502142021321", "서울 강서구", "02-323-1934");
	}
	public void showPerson(PersonEntity[] persons){
		for(PersonEntity person : persons) {
			System.out.println("[이름] " + person.getName()+"\t[성별] "+
					person.getGender()+"\t[전화번호] "+person.getPhone());
		}
	}
	
	
}
