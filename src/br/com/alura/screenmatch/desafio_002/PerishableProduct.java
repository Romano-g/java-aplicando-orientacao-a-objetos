package br.com.alura.screenmatch.desafio_002;

public class PerishableProduct extends Product {
	private int validity;

	public PerishableProduct(String name, double price, int quantity, int validity) {
		super(name, price, quantity);
		this.validity = validity;
	}

	@Override
	public String toString() {
		return super.toString() + ", validity = " + validity;
	}
}
