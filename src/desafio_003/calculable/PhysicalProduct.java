package desafio_003.calculable;

public class PhysicalProduct implements Calculable {
	private double price = 20;
	private double discount = 10;

	@Override
	public double calculateFinalPrice() {
		return price - (discount / 100) * price;
	}
}
