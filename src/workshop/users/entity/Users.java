package workshop.users.entity;

public class Users {
	private String userid;
	private String name;
	private int age;
	private String password;
	private String regdate;
	
	public Users() {
		
	}

	public Users(String userid, String name, int age, String password,
			String regdate) {
		this.userid = userid;
		this.name = name;
		this.age = age;
		this.password = password;
		this.regdate = regdate;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
}
