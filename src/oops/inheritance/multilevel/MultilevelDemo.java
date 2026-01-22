package oops.inheritance.multilevel;

public class MultilevelDemo {
	public static void main(String[] args) {
		Child c = new Child();
		c.wisdom(); // From GrandParent
		c.wealth(); // From Parent
		c.techSkills(); // Own
	}
}