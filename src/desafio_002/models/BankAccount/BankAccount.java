package desafio_002.models.BankAccount;

public class BankAccount {
	protected double balance = 100;

	public double deposit (double depositValue) {
		return (depositValue > 0) ? balance += depositValue : balance;
	}

	public double withdraw (double withdrawValue) {
		return (withdrawValue > 0) ? balance -= withdrawValue : balance;
	}

	public void checkBalance () {
		System.out.println("\nSaldo atual: " + balance);
	}
}
