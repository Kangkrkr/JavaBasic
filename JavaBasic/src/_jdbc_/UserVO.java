package _jdbc_;

public class UserVO {

	private String name;
	private String phone;
	private int birth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return name+"\t"+phone+"\t"+birth+"\t"+getAge();
	}

	private String getAge() {
		return null;
	}

}
