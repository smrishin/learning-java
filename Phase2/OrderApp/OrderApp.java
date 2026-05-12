// OrderApp.java
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class OrderApp {
	public static void main(String[] args) {
		// Product
        System.out.println("\n********* PRODUCT CLASS *********\n");
		Product rice = new Product("Rice", 12.5, 2);
		rice.printProductDetails();

		System.out.println("Product name getter: " + rice.getName());
		System.out.println("Product price getter: $" + rice.getPrice());

		rice.setPrice(17.99);
		rice.setQuantity(-10);
		rice.printProductDetails();

        // Order
        System.out.println("\n********* ORDER CLASS *********\n");

        Order order1 = new Order("ORD1001", "Rishi", rice);

        order1.printOrderDetails();

        System.out.println();

        order1.markAsDelivered();

        System.out.println();

        order1.confirmOrder();

        System.out.println();

        order1.markAsDelivered();

        System.out.println();

        order1.cancelOrder();

        System.out.println();

        order1.printOrderDetails();

	}
}