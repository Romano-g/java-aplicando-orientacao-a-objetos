package desafio_001;

import desafio_001.models.PeopleAge;

public class MainPeopleAge {
	public static void main(String[] args) {
		PeopleAge vickvi = new PeopleAge();

		vickvi.setName("Vitória");
		vickvi.setAge(23);

		System.out.println("Nome: " + vickvi.getName());
		System.out.println("Idade: " + vickvi.getAge());
		System.out.println(vickvi.checkAge());
	}
}
