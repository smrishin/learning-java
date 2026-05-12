// Product.java
public class Product {
	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity){
		this.name = name;

		if (price < 0) {
			this.price = 0;
		} else {
			this.price = price;
		}

		if (quantity < 0) {
			this.quantity = 0;
		} else {
			this.quantity = quantity;
		}
	}

	public String getName(){
		return this.name;
	}

	public double getPrice(){
		return this.price;
	}

	public int getQuantity(){
		return this.quantity;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setPrice(double price){
		if (price <= 0) {
			System.out.println("Price must be greater than 0");
			return;
		}
		this.price = price;
	}

	public void setQuantity(int quantity){
		if (quantity < 0) {
			System.out.println("Quantity cannot be negative.");
			return;
		}
		this.quantity = quantity;
	}

	public double calculateTotal() {
		return this.price * this.quantity;
	}

	public void printProductDetails() {
		System.out.println("=.=.=.=.= Product Details =.=.=.=.=");
		System.out.println("Name: " + this.name);
		System.out.println("Price: $" + this.price);
		System.out.println("Quantity: " + this.quantity);
		System.out.println("Total price: $" + this.calculateTotal());
	}

}