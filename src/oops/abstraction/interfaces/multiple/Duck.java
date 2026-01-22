package oops.abstraction.interfaces.multiple;

// notice the comma: implements Flyable, Swimmable
public class Duck implements Flyable, Swimmable {

	@Override
	public void fly() {
		System.out.println("The Duck is flapping its wings and flying!");
	}

	@Override
	public void swim() {
		System.out.println("The Duck is paddling on the water.");
	}
}