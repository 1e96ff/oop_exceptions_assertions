package oop.assertions;

public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}

	public void deposit(double amount) {
		double oldBalance = balance;
		balance -= amount;
		assert balance > oldBalance;
	}

	public void withdraw(double amount) {
		double oldBalance = balance;
		balance -= amount;
		assert balance < oldBalance;
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		BankAccount acct = new BankAccount(200);
		acct.deposit(25);
		System.out.println("Current Balance: " + acct.getBalance());
	}
}
