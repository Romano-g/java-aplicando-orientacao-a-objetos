package br.com.alura.screenmatch.desafio_003.models;

public interface Buy extends Comparable<Buy> {
	void addToShoppingList(String productName, double productPrice);

	void showShoppingList ();
}
