package desafio_002.models.PrimeNumbers;

public class VerifyPrime extends PrimeNumbers {
	public void checkPrimeResult (int number) {
		if (checkPrimeNumber(number)) {
			System.out.println(number + " é primo");
		} else {
			System.out.println(number + " não é primo");
		}
	}
}
