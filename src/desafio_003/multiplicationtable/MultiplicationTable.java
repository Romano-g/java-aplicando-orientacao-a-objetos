package desafio_003.multiplicationtable;

public class MultiplicationTable implements MultiplicationTableInterface {
	double number;

	public void setNumber(double number) {
		this.number = number;
	}

	@Override
	public void showMultiplicationTable() {
		for (int i = 1; i < 11; i++) {
			System.out.println(number * i);
		}
	}
}
