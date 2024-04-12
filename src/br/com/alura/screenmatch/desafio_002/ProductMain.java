package br.com.alura.screenmatch.desafio_002;

import java.util.ArrayList;

public class ProductMain {
	public static void main(String[] args) {
		var banana = new Product("Banana", 2.50, 3);
		var morango = new Product("Morango", 12, 5);
		var uva = new Product("Uva", 5, 2);

		ArrayList<Product> products = new ArrayList<>();
		products.add(banana);
		products.add(morango);
		products.add(uva);


		var manga = new PerishableProduct("Manga", 10, 3, 60);
		products.add(manga);

		System.out.println(products);
	}
}
