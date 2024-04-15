package br.com.alura.screenmatch.desafio_003;

import br.com.alura.screenmatch.desafio_003.models.CreditCard;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CreditCard visa = new CreditCard();
		Scanner reader = new Scanner(System.in);
		int option = 2;

		while (option != 0) {
			String productName;
			double productPrice;

			visa.remainingCreditCardLimit();
			System.out.println("Digite 1 para adicionar uma compra ou 0 para sair.");
			option = reader.nextInt();

			switch (option) {
				case 1:
					System.out.println("Qual o nome do produto?");
					productName = reader.next();

					if (productName.length() > 0) {
						System.out.println("\nQual o valor do produto?");
						productPrice = reader.nextDouble();
						visa.addToShoppingList(productName, productPrice);
					}
					continue;

				case 0:
					System.out.println("Encerrando.");
					break;

				default:
					System.out.println("Opção inválida.");
					break;
			}
		}
	}
}
