import java.util.Scanner;

public class Phase1_5 {
	public static boolean findTarget(int[] nums, Scanner scanner) {

		System.out.println("Enter number:");
		int target = scanner.nextInt();
		scanner.nextLine();

		for (int num:nums){
			if (target == num){
				return true;
			}

		}
		return false;
	}

	private static int findLargest(int[] nums){
		int largest = nums[0];
		for (int num:nums) {
			if (num > largest) {
				largest = num;
			}
		}

		return largest;
	}

	private static int findSmallest(int[] nums){
		int smallest = nums[0];
		for (int num:nums) {
			if (num < smallest) {
				smallest = num;
			}
		}

		return smallest;
	}

	private static int calculateSum(int[] nums){
		int sum = 0;

		for (int num:nums) {
			sum += num;
		}

		return sum;
	}

	private static int countEvenNumbers(int[] nums) {
		int evenCount = 0;

		for (int num:nums) {
			if (num % 2 == 0){
				evenCount++;
			}
		}
		return evenCount;
	}

	private static int selector(Scanner scanner) {
		System.out.println("\nSelect operation to perform on the array");
		System.out.println("1. Find Target in Array");
		System.out.println("2. Find Largest in Array");
		System.out.println("3. Find Smallest in Array");
		System.out.println("4. Find Sum of the Array");
		System.out.println("5. Find Even numbers count of the Array");
		System.out.println("6. Exit");
		System.out.println("Enter your choice: ");

		int option = scanner.nextInt();
		scanner.nextLine();
		return option;
	}

	public static void main(String[] args) {
		int[] nums = {7, 12, 25, 31, 45, 40, 18};
		Scanner scanner = new Scanner(System.in);

		boolean runProgram = true;
		while(runProgram) {
			int option = selector(scanner);
			switch(option) {
				case 1:
					boolean res = findTarget(nums, scanner);
					System.out.println("Target" + (res ? " " : " not ") + "found in the array");
					break;
				case 2:
					System.out.println("Largest element in array is " + findLargest(nums));
					break;
				case 3:
					System.out.println("Smallest element in array is " + findSmallest(nums));
					break;
				case 4:
					System.out.println("Sum of the array elements is " + calculateSum(nums));
					break;
				case 5:
					System.out.println("Array has " + countEvenNumbers(nums) + " even numbers");
					break;
				case 6:
					runProgram = false;
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid choice!");
					break;
			}
		}


		scanner.close();

	}
}