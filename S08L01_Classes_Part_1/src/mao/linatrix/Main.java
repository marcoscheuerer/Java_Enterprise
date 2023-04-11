package mao.linatrix;

public class Main {

	public static void main(String[] args) {
		// Create object (make an instance) "car" of class "Car"
		Car car = new Car();
		
		car.setSpeed(10);
		System.out.println(car.getSpeed());
		
		car.setIsDoorClosed(true);
		System.out.println(car.getIsDoorClosed());
		
	}

}
