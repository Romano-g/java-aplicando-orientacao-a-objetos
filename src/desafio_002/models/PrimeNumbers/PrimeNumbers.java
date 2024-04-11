package desafio_002.models.PrimeNumbers;

public class PrimeNumbers {
	protected boolean checkPrimeNumber (int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	public void listPrimeNumbers (int limit) {
		System.out.println("Números primos ate " + limit + ": ");

		for (int i = 2; i <= limit; i++) {
			System.out.println(i + " ");
		}

		System.out.println();
	}
}
