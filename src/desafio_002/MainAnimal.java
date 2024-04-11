package desafio_002;

import desafio_002.models.Animal.Cat;
import desafio_002.models.Animal.Dog;

public class MainAnimal {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();

		cat.makeSound();
		dog.makeSound();

		cat.scratch();
		dog.wagYourTail();
	}
}
