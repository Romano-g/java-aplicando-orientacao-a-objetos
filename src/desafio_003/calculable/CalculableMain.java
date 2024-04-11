package desafio_003.calculable;

public class CalculableMain {
	public static void main(String[] args) {
		Book book = new Book();
		PhysicalProduct physicalProduct = new PhysicalProduct();

		System.out.println(
				"Preço final do livro: " + book.calculateFinalPrice() +
				"\nPreço final produto físico: " + physicalProduct.calculateFinalPrice()
		);
	}
}
