import java.util.Scanner;	

public class Phase1 {
	private static void printOddOrEven(int number) {
		if (number % 2 == 0) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is odd");
		}
	}

	private static void calculator(Scanner scanner) {
		System.out.println("CALCULATOR APP");

		System.out.println("Enter first number:");
		int a = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter second number:");
		int b = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Choose operator +,-,*,/,%");
		char operator = scanner.next().charAt(0);
		scanner.nextLine();

		printOddOrEven(a);
		printOddOrEven(b);

		switch(operator) {
			case '+':
				System.out.println("Addition: " + (a + b));
				break;

			case '-':
				System.out.println("Subtraction " + (a - b));
				break;

			case '*':
				System.out.println("Multiplication " + (a * b));
				break;

			case '/':
				if (b == 0) {
					System.out.println("Cannot divide by Zero");
				} else {
					System.out.println("Division " + (a / b));
				}
				break;

			case '%':
				if (b == 0) {
					System.out.println("Cannot modulo by Zero");
				} else {
					System.out.println("Modulo " + (a % b));
				}
				break;
			default:
				System.out.println("Invalid Operator");

		}
	}

	private static void multiplicationTable(Scanner scanner) {
		System.out.println("MULTIPLICATION TABLE");

		System.out.println("Enter a number multiplication table:");
		int a = scanner.nextInt();
		scanner.nextLine();
		int i = 1;
		// for (int i = 1; i <= 10; i++) {
		while (i <= 10){
			System.out.println(a + " x " + i + " = " + (a*i));
			i++;
		}
	}

	private static void reverseString(Scanner scanner) {
		System.out.println("REVERSE A STRING");
		System.out.print("Enter text to reverse:");
		String text = scanner.nextLine();

		for(int i = text.length() - 1; i >= 0 ; i--){
			System.out.print(text.charAt(i));
		}
		System.out.println("");
	}

	private static void countVowels(Scanner scanner) {
		System.out.println("VOWELS COUNT");

		System.out.println("Enter text to count vowels:");
		String text = scanner.nextLine();

		int vowelsCount = 0;
		text = text.toLowerCase();

		for (int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vowelsCount++;
			}
			// switch(text.charAt(i)){
			// 	case 'a':
			// 	case 'e':
			// 	case 'i':
			// 	case 'o':
			// 	case 'u':
			// 		vowelsCount++;
			// }
		}

		System.out.println(text + " has " + vowelsCount + " vowels.");
	}

	private static int selector(Scanner scanner) {
		System.out.println("\nChoose an option to proceed:");
		System.out.println("1. Calculator");
		System.out.println("2. Multiplication Table");
		System.out.println("3. Reverse a String");
		System.out.println("4. Count vowels");
		System.out.println("5. Exit");

		int option = scanner.nextInt();
		scanner.nextLine();

		return option;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean runProgram = true;

		while (runProgram) {
			int option = selector(scanner);
			switch(option){
				case 1:
					// Calculator app;
					calculator(scanner);
					break;
				case 2:
					// Multiplication Table
					multiplicationTable(scanner);
					break;
				case 3:
					// Reverse a String
					reverseString(scanner);
					break;
				case 4:
					// Vowel Count
					countVowels(scanner);
					break;
				case 5:
					// Exit
					System.out.println("Exiting");
					runProgram = false;
					break;
				default:
					System.out.println("Invalid Choice!");
			}
		}
		scanner.close();

	}
}