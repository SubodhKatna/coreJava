package oops.polymorphism.runtime;

public class OverridingDemo {
	public static void main(String[] args) {

		// 1. Parent Reference, Parent Object
		Animal a1 = new Animal();
		a1.makeSound(); // "Generic sound"

		// 2. Parent Reference, Child Object (Upcasting)
		// This is Dynamic Method Dispatch!
		Animal a2 = new Dog();
		a2.makeSound(); // Java sees it's actually a Dog object, so it runs "Woof"

		Animal a3 = new Cat();
		a3.makeSound(); // Java sees it's actually a Cat object, so it runs "Meow"

		// Why is this useful?
		// You can create an array of Animals and loop through them without knowing
		// exact types!
	}
}