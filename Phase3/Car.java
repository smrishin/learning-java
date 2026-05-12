public class Car extends Vehicle {
	int numOfDoors;

	public Car (String brand, int speed, int numOfDoors){
		super(brand, speed);
		this.numOfDoors = numOfDoors;
	}

	public void openTrunk() {
		System.out.println("The trunk is open");
	}
}