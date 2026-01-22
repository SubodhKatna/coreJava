package basics.structure;

public class Printing {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.print("My name is ");
		System.out.print("Subodh Katna\n");
		System.out.println("I am 19 years old");

		String name = "Alex";
		double price = 19.999;
		System.out.printf("Item: %s, Price: $%.2f\n", name, price);

		System.out.format("Value: %d", 100);
	}

}
