package workshop.student.entity;
//JavaBeans ,  Value Object (VO), Data Transfer Object (DTO)
//����(�ν��Ͻ�����, Ŭ����(static)) �������� ù����, �ι�° ���ڴ� �ݵ�� �ҹ���
//�÷���� �����ϰ� �Ҷ� �빮�ڷ� �ۼ��ϸ� �ʵȴ�.
public class Student {
	private String name;
	private int studentID;
	private int kor;
	private int math;
	private int eng;
	
	public Student()
	{
		
	}

	public Student(String name, int studentID, int kor, int math, int eng) {
		super();
		this.name = name;
		this.studentID = studentID;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public int getStudentID() {
		return studentID;
	}

	public int getKor() {
		return kor;
	}

	public int getMath() {
		return math;
	}

	public int getEng() {
		return eng;
	}
	public int getSum() {
		return kor+math+eng;
	}
	public int getAvg() {
		return (kor+math+eng)/3;
	}
	public char getGrade()
	{
		switch(this.getAvg()/10)
		{
			case 10 : return 'A';
			case 9 : return 'A'; 
			case 8 : return 'B'; 
			case 7 : return 'C'; 
			case 6 : return 'D'; 
			default : return 'F'; 
		}
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studentID=" + studentID + ", kor="
				+ kor + ", math=" + math + ", eng=" + eng + "]";
	}
	
	
	
}
