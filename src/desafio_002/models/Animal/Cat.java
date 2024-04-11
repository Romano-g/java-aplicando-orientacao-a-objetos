package desafio_002.models.Animal;

public class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("O gato está miando.");
	}

	public void scratch () {
		System.out.println("O gato está arranhando os móveis.");
	}
}
