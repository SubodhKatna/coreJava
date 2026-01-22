package oops.abstraction.interfaces;

public class InterfaceDemo {
	public static void main(String[] args) {

		System.out.println("--- Checkout Page ---");

		// Polymorphism in action: Using Interface reference
		PaymentMethod method1 = new CreditCard("1234567812349876");
		method1.pay(120.50);
		method1.getReceipt();

		System.out.println();

		PaymentMethod method2 = new PayPal("user@example.com");
		method2.pay(55.00);
		method2.getReceipt();
	}
}