package br.com.alura.screenmatch.desafio_003.models;

import java.util.*;

public class CreditCard implements Buy {
	private HashMap<String, Double> shoppingList = new HashMap<>();
	private double creditCardLimit = 1000;
	private double shoppingTotal;

	public void remainingCreditCardLimit () {
		System.out.printf("""
				-------------------------------------------------------------
				Saldo atual:										%.2f
				-------------------------------------------------------------
				""", (creditCardLimit - shoppingTotal));
	}

	@Override
	public void addToShoppingList(String productName, double productPrice) {
		if (shoppingTotal < creditCardLimit) {
			shoppingList.put(productName, productPrice);
			shoppingTotal += productPrice;
			System.out.println("\nCompra adicionada: " + productName +
					", no valor de " + productPrice);
			showShoppingList();
		} else {
			System.out.println("\nSaldo insuficiente.");
		}
	}

	@Override
	public void showShoppingList() {
		Map<String, Integer> sortedByValue = shoppingList.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(LinkedHashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue().intValue()), Map::putAll);
		System.out.println(sortedByValue);
	}

	@Override
	public int compareTo(Buy b) {
		return 0;
	}
}
