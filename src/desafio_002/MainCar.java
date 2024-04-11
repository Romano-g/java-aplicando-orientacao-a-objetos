package desafio_002;

import desafio_002.models.Car.ModelCar;

public class MainCar {
	public static void main(String[] args) {
		ModelCar toyota = new ModelCar();

		toyota.setModel("Toyota");
		toyota.setPrices(30000, 50000, 20000);

		toyota.showDatasheet();
	}
}
