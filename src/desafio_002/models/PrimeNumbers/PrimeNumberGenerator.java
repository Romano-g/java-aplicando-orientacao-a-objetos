package desafio_002.models.PrimeNumbers;

public class PrimeNumberGenerator extends PrimeNumbers {
	public int generateNextPrimeNumber (int lastPrime) {
		int nextPrime = lastPrime + 1;

		while (!checkPrimeNumber(nextPrime)) {
			nextPrime++;
		}

		return nextPrime;
	}
}
