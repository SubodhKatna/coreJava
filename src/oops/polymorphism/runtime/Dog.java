package oops.polymorphism.runtime;

public class Dog extends Animal {
	// @Override ensures we are actually overriding, not just making a typo
	@Override
	public void makeSound() {
		System.out.println("Dog barks: Woof Woof!");
	}
}