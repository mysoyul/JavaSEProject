package chapter3.oop;
//�ڹٺ���(Java Beans), VO(Value Object)
public class MyDate {
	private int year;
	private int month;
	private int day;
	
	//default constructor
	public MyDate() {
		System.out.println("Default Constructor�� ȣ���!!");
	}
	//constructor overloading (������ �ߺ�����)
	public MyDate(int year, int month, int day) {
		this.year = year;
		//this.month = month;
		setMonth(month);
		this.day = day;
	}
	
	
	//setter method
	public void setYear(int year) {
		this.year = year;
	}
	//getter 
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month >= 1 && month <= 12 ){
			this.month = month;
		}else {
			System.out.println("Month�� 1~12 ������ ���� �����մϴ�.");
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
//	@Override
//	public String toString() {
//		return year + "-" + month + "-" + day;
//	}
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day
				+ "]";
	}
	
	
	
	
}
