package desafio_002.models.Animal;

public class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("O cachorro está latindo.");
	}

	public void wagYourTail () {
		System.out.println("O cachorro está abanando o rabo.");
	}
}
