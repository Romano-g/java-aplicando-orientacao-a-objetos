package desafio_002.models.Car;

public class Car {
	private String model;
	private double priceFirstYear;
	private double priceSecondYear;
	private double priceThirdYear;

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrices (
			double priceFirstYear, double priceSecondYear, double priceThirdYear
	) {
		this.priceFirstYear = priceFirstYear;
		this.priceSecondYear = priceSecondYear;
		this.priceThirdYear = priceThirdYear;
	}

	public void showDatasheet () {
		System.out.println("\nModelo: " + model);
		System.out.printf("""
				\nPreço primeiro ano: %.2f
				Preço segundo ano: %.2f
				Preço terceiro ano: %.2f
				Menor preço: %.2f
				Maior preço: %.2f
				""", priceFirstYear, priceSecondYear, priceThirdYear,
				lowerPriceCalculator(), biggestPriceCalculator());
	}

	private double lowerPriceCalculator () {
		double lowerPrice = priceFirstYear;

		if (priceFirstYear > priceSecondYear && priceThirdYear > priceSecondYear) {
			lowerPrice = priceSecondYear;
		} else if (priceSecondYear > priceThirdYear && priceFirstYear > priceThirdYear) {
			lowerPrice = priceThirdYear;
		}

		return lowerPrice;
	}

	private double biggestPriceCalculator () {
		double biggestPrice = priceFirstYear;
		
		if (priceSecondYear > priceFirstYear && priceSecondYear > priceThirdYear) {
			biggestPrice = priceSecondYear;
		} else if (priceThirdYear > priceSecondYear && priceThirdYear > priceFirstYear) {
			biggestPrice = priceThirdYear;
		}

		return biggestPrice;
	}
}
