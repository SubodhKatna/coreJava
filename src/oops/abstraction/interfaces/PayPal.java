package oops.abstraction.interfaces;

public class PayPal implements PaymentMethod {

	private String email;

	public PayPal(String email) {
		this.email = email;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Paid $" + amount + " using PayPal (" + email + ")");
	}

	@Override
	public void getReceipt() {
		System.out.println(">> E-mailing PayPal Receipt to " + email);
	}
}