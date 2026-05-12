// Phase2.java
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class BankApp {

	private static void selector(){
		System.out.println("\nWhat would you like to do today?");
		System.out.println("1. Create Bank Account");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Check Balance");
		System.out.println("5. Show Account Information");
		System.out.println("6. Show all Accounts Information");
		System.out.println("7. Exit");
	}

	private static int getSelectedOption(Scanner scanner) {
		System.out.println("Select:");
		if (scanner.hasNextInt()) {
			int option = scanner.nextInt();
			scanner.nextLine();
			return option;
		} else {
			scanner.nextLine();
			return -1;
		}
	}

	private static double handleInputAmount(Scanner scanner, String displayMessage) {
		while (true) {
			System.out.println(displayMessage);
			if (scanner.hasNextDouble()){
				double amount = scanner.nextDouble();
				scanner.nextLine();
				return amount;
			}
			scanner.nextLine();
			System.out.println("Invalid value. Please input a valid number");
		}
	}

	private static String createRandomAccountNumber() {
		String num = "";
		Random random = new Random();

		for (int i = 0; i < 4; i++) {
			num += random.nextInt(10);
		}

		return "ACC" + num;
	}

	private static BankAccount createBankAccount(Scanner scanner){
		System.out.println("======= Create Bank Account =======");
		System.out.println("Enter Account Holder Name:");
		String accountHolderName = scanner.nextLine();
		while (accountHolderName.trim().isEmpty()) {
			System.out.println("Name is required.");
			accountHolderName = scanner.nextLine();
		}

		double balance = handleInputAmount(scanner, "Enter balance:");

		String accountNumber = createRandomAccountNumber();
		while (BankAccount.accountNumberExists(accountNumber)) {
			accountNumber = createRandomAccountNumber();
		}
		BankAccount.addAccountNumbersSet(accountNumber);


		System.out.println("New Account created successfully. Your Account number is " + accountNumber);

		return new BankAccount(accountHolderName, accountNumber, balance);
	}

	private static BankAccount findBankAccount(Scanner scanner, ArrayList<BankAccount> accounts) {
		System.out.println("Enter Account number (without ACC prefix): ");
		int targetAccountNumber;
		if (scanner.hasNextInt()) {
			targetAccountNumber = scanner.nextInt();
			scanner.nextLine();
		} else {
			scanner.nextLine();
			return null;
		}

		String fullTargetAccountNumber = "ACC" + targetAccountNumber;
		for (BankAccount account:accounts){
			if (account == null){
				break;
			}

			if (account.getAccountNumber().toUpperCase().equals(fullTargetAccountNumber)){
				return account;
			}
		}
		return null;
	}

	private static void printAllAccountDetails(ArrayList<BankAccount> accounts) {
		if (accounts.size() == 0){
			System.out.println("No accounts created yet.");
		}
		for (BankAccount acc:accounts) {
			acc.printAccountDetails();
		}
	}

	private static void handleDeposit(Scanner scanner, BankAccount account) {
		System.out.println("====== Depositing ======");
		double amount = handleInputAmount(scanner, "Enter amount to deposit:");
		account.depositMoney(amount);
	}

	private static void handleWithdraw(Scanner scanner, BankAccount account) {
		System.out.println("====== Withdrawal ======");
		double amount = handleInputAmount(scanner, "Enter amount to withdraw:");
		account.withdrawMoney(amount);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// BankAccount[] accounts = new BankAccount[5];
		ArrayList<BankAccount> accounts = new ArrayList<>();
		// BankAccount newAccount = createBankAccount(scanner);

		boolean runProgram = true;
		while (runProgram) {
			selector();
			int option = getSelectedOption(scanner);

			switch(option) {
				case 1:
					BankAccount newAccount = createBankAccount(scanner);
					accounts.add(newAccount);
					System.out.println("Total acounts created are: " + BankAccount.getTotalAccounts());
					break;
				case 2:
					BankAccount acc = findBankAccount(scanner, accounts);
					if (acc == null) {
						System.out.println("Account Number does not exist");
					} else {
						handleDeposit(scanner, acc);
					}
					break;
				case 3:
					acc = findBankAccount(scanner, accounts);
					if (acc == null) {
						System.out.println("Account Number does not exist");
					} else {
						handleWithdraw(scanner, acc);
					}
					break;
				case 4:
					acc = findBankAccount(scanner, accounts);
					if (acc == null) {
						System.out.println("Account Number does not exist");
					} else {
						acc.checkBalance();
					}
					break;
				case 5:
					acc = findBankAccount(scanner, accounts);
					if (acc == null) {
						System.out.println("Account Number does not exist");
					} else {
						acc.printAccountDetails();
					}
					break;
				case 6:
					printAllAccountDetails(accounts);
					break;
				case 7:
					runProgram = false;
					System.out.println("Goodbye, Have a great day!");
					break;
				default:
					System.out.println("Invalid Choice, try again!");
					break;
			}
		}

		scanner.close();


		// User user1 = new User("Rishi", 29, "smrishin@gmail.com");
		// User user2 = new User("Harsha", 32, "harsha@gmail.com");

		// user1.printUserDetails();
		// user2.printUserDetails();

		// Product rice = new Product("Rice", 19.99, 50);
		// rice.printProductDetails();

		// System.out.println("Product name getter: " + rice.getName());
		// System.out.println("Product price getter: $" + rice.getPrice());

		// rice.setPrice(17.99);
		// rice.setQuantity(-10);
		// rice.printProductDetails();

		// 9628
		// 7278
		// 8099
		// 4049
		// 5300

	}
}