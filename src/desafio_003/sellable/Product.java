package desafio_003.sellable;

public class Product implements Sellable {
	private int price = 40;
	private int quantityOfProducts;
	public double discount;

	public void setDiscount(double discount) {
		this.discount = discount / 100;
	}

	public void setQuantityOfProducts(int quantityOfProducts) {
		this.quantityOfProducts = quantityOfProducts;
	}

	@Override
	public double calculateFinalPrice() {
		return (price - (price * discount)) * quantityOfProducts;
	}
}
