package desafio_001;

import desafio_001.models.Product;

public class MainProduct {
	public static void main(String[] args) {
		Product sabonete = new Product();

		sabonete.setName("Ypê");
		sabonete.setPrice(10.00);

		System.out.println(sabonete.applyDiscount(25));
	}
}
