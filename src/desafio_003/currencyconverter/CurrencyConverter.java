package desafio_003.currencyconverter;

public class CurrencyConverter implements FinancialConversion {
	private double dollarValue;

	public void setDollarValue(double dollarValue) {
		this.dollarValue = dollarValue;
	}

	@Override
	public double convertDollarToReal() {
		return dollarValue * 5.08;
	}
}
