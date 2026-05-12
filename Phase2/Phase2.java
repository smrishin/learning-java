// Phase2.java
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Phase2 {
	public static void main(String[] args) {
		// User
        System.out.println("\n********* USER CLASS *********\n");
		User user1 = new User("Rishi", 29, "smrishin@gmail.com");
		User user2 = new User("Harsha", 32, "harsha@gmail.com");

		user1.printUserDetails();
		user2.printUserDetails();

		// Student
        System.out.println("\n********* STUDENT CLASS *********\n");
		Student rishi = new Student("Rishi", 29, "CS", 4.0);

		System.out.println("Just created " + rishi.getName() + "'s student account.");

		rishi.printStudentDetails();

		rishi.setGpa(3.5);
		rishi.printStudentDetails();

		rishi.setGpa(5);
		rishi.printStudentDetails();

		// Car
        System.out.println("\n********* CAR CLASS *********\n");

		Car car1 = new Car("BMW", "X3", 2019);

		car1.printCarDetails();

        System.out.println();

        car1.accelerate(20);

        System.out.println();

        car1.startCar();
        car1.accelerate(30);
        car1.accelerate(20);

        System.out.println();

        car1.stopCar();

        System.out.println();

        car1.brake(40);
        car1.brake(20);

        System.out.println();

        car1.stopCar();

        System.out.println();

        car1.printCarDetails();
	}
}