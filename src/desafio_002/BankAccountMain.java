package desafio_002;

import desafio_002.models.BankAccount.CheckingAccount;

public class BankAccountMain {
	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount();

		checkingAccount.monthlyFee(1.00);

		checkingAccount.deposit(1000);
		checkingAccount.checkBalance();
		checkingAccount.withdraw(500);
		checkingAccount.checkBalance();
	}
}
