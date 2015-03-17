package quan.filterpattern;

public class Person implements Cloneable{
	private int age;
	private String sex;
	
	public Person(int age, String sex) {
		this.age = age;
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void setPerson(int age, String sex) {
		this.age = age;
		this.sex = sex;
	}
	
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return clone;
	}
}
