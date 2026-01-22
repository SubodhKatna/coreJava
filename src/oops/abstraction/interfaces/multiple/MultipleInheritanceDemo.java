package oops.abstraction.interfaces.multiple;

public class MultipleInheritanceDemo {
	public static void main(String[] args) {

		System.out.println("--- Duck Capabilities ---");
		Duck donald = new Duck();

		// It can do both!
		donald.fly();
		donald.swim();

		System.out.println("\n--- Polymorphism with Multiple Interfaces ---");
		// We can treat the Duck specifically as a 'Flyable' thing
		Flyable f = donald;
		f.fly();
		// f.swim(); // ERROR: The 'Flyable' view doesn't know about swimming.

		// Or we can treat it as a 'Swimmable' thing
		Swimmable s = donald;
		s.swim();
	}
}