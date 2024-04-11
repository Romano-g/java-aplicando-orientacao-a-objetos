package desafio_001.models;

public class PeopleAge {
	private String name;
	private int age;

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

	public String checkAge () {
		String s = (age >= 18) ? name + " é maior de idade" : name + " é menor de idade";
		return s;
	}
}
