// BankAccount.java
import java.util.Set;
import java.util.HashSet;

public class BankAccount{
	private String accountHolderName;
	private String accountNumber;
	private double balance;

	private static int totalAccounts = 0;
	private static Set<String> accountNumbersSet = new HashSet<>();

	public BankAccount(String accountHolderName, String accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;

		if (balance >= 0) {
			this.balance = balance;
		} else {
			System.out.println("Starting balance cannot be negative, balance set to 0");
			this.balance = 0;
		}

		totalAccounts++;
	}

	// Getters
	public String getAccountHolderName() {
		return this.accountHolderName;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public static int getTotalAccounts() {
		return totalAccounts;
	}

	// public static Set<String> getAccountNumbersSet() {
	// 	return accountNumbersSet;
	// }

	public static void addAccountNumbersSet(String acc) {
		accountNumbersSet.add(acc);
	}

	public static boolean accountNumberExists(String acc) {
		return accountNumbersSet.contains(acc);
	}

	public void printAccountDetails() {
		System.out.println("==== Bank Account Details ====");
		System.out.println("Account Holder: " + this.accountHolderName);
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Balance: $" + this.balance);
	}

	public void depositMoney(double amount) {
		if (amount <= 0) {
			System.out.println("Deposit amount must be greater than 0.");
			return;
		}

		this.balance += amount;

		System.out.println("Deposited $" + amount);
		System.out.println("New balance is $" + this.balance);
	}

	public void withdrawMoney(double amount) {
		if (amount <= 0) {
			System.out.println("Withdrawal amount should be greater than 0.");
			return;
		}

		if (this.balance < amount) {
			System.out.println("Insufficient Balance. Current balance is $" + this.balance);
			return;
		}

		this.balance -= amount;

		System.out.println("Withdrawn $" + amount);
		System.out.println("New balance is $" + this.balance);
	}

	public void checkBalance() {
		System.out.println("Balance is $" + this.balance);
	}

}
