package workshop.person.control;

import workshop.person.entity.PersonEntity;

public class PersonManager {

	public static void main(String[] args) {
		//PersonEntity �迭����
		PersonEntity[] persons = new PersonEntity[3];
		
		PersonManager mgr = new PersonManager();
		mgr.fillPersons(persons);
		mgr.showPerson(persons);
		System.out.println(mgr.findbyGender(persons, '��'));
		mgr.showPerson(persons, "���ϴ�");
		
	}//main
	public void showPerson(PersonEntity[] persons, String name) {
		for (PersonEntity person : persons) {
			if(person.getName().equals(name)) {
				System.out.println("[�̸�] " + person.getName());
				System.out.println("[����] " + person.getGender());
				System.out.println("[��ȭ��ȣ] " + person.getPhone());
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
		persons[0] = new PersonEntity("�̼�ȣ","7212121028102", "��õ ��籸", "032-392-2932");
		persons[1] = new PersonEntity("���ϴ�","7302132363217", "���� ������", "02-362-1932");
		persons[2] = new PersonEntity("�̹̼�","7502142021321", "���� ������", "02-323-1934");
	}
	public void showPerson(PersonEntity[] persons){
		for(PersonEntity person : persons) {
			System.out.println("[�̸�] " + person.getName()+"\t[����] "+
					person.getGender()+"\t[��ȭ��ȣ] "+person.getPhone());
		}
	}
	
	
}
