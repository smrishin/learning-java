// Order.java
enum OrderStatus {
	PENDING,
	CONFIRMED,
	DELIVERED,
	CANCELLED

}

public class Order {
	// private static final String STATUS_PENDING = "PENDING";
	// private static final String STATUS_CONFIRMED = "CONFIRMED";
	// private static final String STATUS_CANCELLED = "CANCELLED";
	// private static final String STATUS_DELIVERED = "DELIVERED";

	private String orderId;
	private String customerName;
	private Product product;
	private OrderStatus status;

	public Order(String orderId, String customerName, Product product) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.product = product;

		this.status = OrderStatus.PENDING;
	}

	// Getters
	public String getOrderId() {
		return this.orderId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public Product getProduct() {
		return this.product;
	}

	public OrderStatus getStatus() {
		return this.status;
	}

	public void confirmOrder() {
		if (this.status != OrderStatus.PENDING) {
			System.out.println("!! Only pending orders can be confirmed");
			return;
		}
		this.status = OrderStatus.CONFIRMED;
		System.out.println("Order Confirmed.");
	}

	public void cancelOrder() {
		if (this.status == OrderStatus.DELIVERED) {
			System.out.println("!! Cannot cancel delivered order.");
			return;
		}

		if (this.status == OrderStatus.CANCELLED) {
			System.out.println("Order already cancelled");
			return;
		}

		this.status = OrderStatus.CANCELLED;
		System.out.println("Order Cancelled.");
	}

	public void markAsDelivered() {
		if (this.status != OrderStatus.CONFIRMED) {
			System.out.println("!! Only confirmed orders can be delivered");
			return;
		}
		this.status = OrderStatus.DELIVERED;
		System.out.println("Order delivered.");		
	}

	public void printOrderDetails() {
		System.out.println("===== Order Details =====");
		System.out.println("Order ID: " + this.orderId);
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Status: " + this.status);

		System.out.println();
		this.product.printProductDetails();
	}
}