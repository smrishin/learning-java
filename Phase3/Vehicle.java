public class Vehicle {
	String brand;
	int speed;

	public Vehicle (String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}

	public void start() {
		System.out.println(this.brand + " is starting");
	}

	public void stop() {
		System.out.println(this.brand + " is stopping");
	}

	public void displayInfo(){
		System.out.println("Brand: " + this.brand);
		System.out.println("Speed: " + this.speed + " mph");
	}
}

