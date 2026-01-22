package oops.fundamentals;

class Car {
	String model;
	String color;
	int currentSpeed;

	void startEngine() {
		System.out.println(color + " " + model + " is starting...");
		currentSpeed = 0;
	}

	void accelerate() {
		currentSpeed += 10;
		System.out.println("Speeding up! Current speed: " + currentSpeed);
	}
}

public class ClassAndObject {
	public static void main(String[] args) {
		System.out.println("--- Object 1 ---");
		Car myCar = new Car();
		myCar.model = "Tesla Model 3";
		myCar.color = "Red";
		myCar.startEngine();
		myCar.accelerate();
		System.out.println("\n--- Object 2 ---");
		Car yourCar = new Car();
		yourCar.model = "Ford Mustang";
		yourCar.color = "Blue";

		yourCar.startEngine();
	}
}