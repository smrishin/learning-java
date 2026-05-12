// Phase 3
public class Phase3 {

	public static void main(String[] args) {
		Car car = new Car();

		car.brand = "BMW";
		car.speed = 120;
		car.numOfDoors = 4;

		car.start();
		car.openTrunk();
		car.stop();

		System.out.println();

		Bike bike = new Bike();

		bike.brand = "Hercules";
		bike.speed = 20;
		bike.hasCarrier = false;

		bike.start();
		bike.ringBell();
		bike.stop();



	}
}