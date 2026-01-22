package oops.inheritance.hierarchical;

public class HierarchicalDemo {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw(); // Inherited
		c.roll();
		// c.corners(); // Error! Circle does not know about Square.

		Square s = new Square();
		s.draw(); // Inherited
		s.corners();
	}
}