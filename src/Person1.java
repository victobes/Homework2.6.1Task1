
public class Person1 {
	private int age;
	private String name;
	
	public Person1 (String name, int age) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		//String e = Integer.toString(this.age);
		return new StringBuilder().append("(").append(name).append(", ").append(age).append(")").toString();
	}
}
