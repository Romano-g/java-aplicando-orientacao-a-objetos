package desafio_003.currencyconverter;

public class CurrencyMain {
	public static void main(String[] args) {
		CurrencyConverter currencyConverter = new CurrencyConverter();

		currencyConverter.setDollarValue(20);

		System.out.printf("%.2f", currencyConverter.convertDollarToReal());
	}
}
