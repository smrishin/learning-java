public class Car {
	private String brand;
	private String model;
	private int year;
	private int speed;
	private boolean isRunning;

	// constructor
	public Car (String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.speed = 0;
		this.isRunning = false;
	}

	// Getters
	public String getBrand() {
		return this.brand;
	}

	public String getModel() {
		return this.model;
	}

	public int getYear() {
		return this.year;
	}

	public int getSpeed() {
		return this.speed;
	}

	public boolean getIsRunning() {
		return this.isRunning;
	}

	// Setters
	public void startCar() {
		if (this.isRunning) {
			System.out.println("Car is already running");
		} else {
			this.isRunning = true;
			System.out.println("Car has started");
		}
	}
	
	public void stopCar() {
		if (!this.isRunning) {
			System.out.println("Car is already stopped");
		} else if (this.speed > 0) {
			System.out.println("Cannot stop car while moving");
		} else {
			this.isRunning = false;
			System.out.println("Car stopped");
		}
	}

	public void accelerate(int amount) {
		if (!isRunning) {
			System.out.println("!! Car is not running, cannot accelerate");
			return;
		}

		if (amount <= 0) {
			System.out.println("!! Must has amount > 0 to accelerate.");
			return;
		}

		this.speed += amount;
		System.out.println("Car accelerated by " + amount + " mph");
		System.out.println("Current speed: " + this.speed + " mph");
	}

	public void brake(int amount) {
		if (amount <= 0) {
			System.out.println("!! Brake amount must be > 0.");
			return;
		}

		if (this.speed == 0) {
			System.out.println("Car is already at 0 mph");
			return;
		}

		this.speed -= amount;

		if (this.speed < 0){
			this.speed = 0;
		}

		System.out.println("Car braked by " + amount + " mph");
		System.out.println("Current speed: " + this.speed + " mph");
	}

	public void printCarDetails() {
		System.out.println("===== Car Details =====");
		System.out.println("Brand: " + this.brand);
		System.out.println("Model: " + this.model);
		System.out.println("Year: " + this.year);
		System.out.println("Speed: " + this.speed + " mph");
		System.out.println("isRunning: " + this.isRunning);
	}
}