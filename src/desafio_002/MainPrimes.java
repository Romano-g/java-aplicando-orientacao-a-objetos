package desafio_002;

import desafio_002.models.PrimeNumbers.PrimeNumberGenerator;
import desafio_002.models.PrimeNumbers.PrimeNumbers;
import desafio_002.models.PrimeNumbers.VerifyPrime;

public class MainPrimes {
	public static void main(String[] args) {
		VerifyPrime verifyPrime = new VerifyPrime();
		verifyPrime.checkPrimeResult(17);

		PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGenerator();
		int nextPrime = primeNumberGenerator.generateNextPrimeNumber(17);
		System.out.println("O proximo primo é " + nextPrime);

		PrimeNumbers primeNumbers = new PrimeNumbers();
		primeNumbers.listPrimeNumbers(30);
	}
}
