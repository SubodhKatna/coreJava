package oops.abstraction.interfaces;

public class CreditCard implements PaymentMethod {

	private String cardNumber;

	public CreditCard(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Paid $" + amount + " using Credit Card ending in " + cardNumber.substring(12));
	}

	@Override
	public void getReceipt() {
		System.out.println(">> Generating Credit Card Receipt...");
	}
}