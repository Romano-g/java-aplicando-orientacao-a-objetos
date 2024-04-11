package desafio_001.models;

public class Product {
	private String name;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double applyDiscount (double discount) {
		price -= price * (discount / 100);
		return price;
	}
}
