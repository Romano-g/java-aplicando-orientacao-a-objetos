package desafio_003.calculable;

public class Book implements Calculable {
	private double price = 20;
	private double taxes = 10;

	@Override
	public double calculateFinalPrice() {
		return (taxes / 100) * price + price;
	}
}
