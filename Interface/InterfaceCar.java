package over;

public class InterfaceCar {

	public static void main(String[] args) {
		HDCar car = new HDCar();
		car.start();
		car.setSpeed(30);
		car.turn(15);
		car.stop();
	}
}
