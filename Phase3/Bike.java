public class Bike extends Vehicle {
	boolean hasCarrier;

	public Bike (String brand, int speed, boolean hasCarrier) {
		super(brand, speed);
		this.hasCarrier = hasCarrier;
	}

	public void ringBell() {
		System.out.println("Tring Tring!");
	}
}