package oops.abstraction.interfaces;

public interface PaymentMethod {

	// 1. Constants (public static final by default)
	// You rarely put variables here, but if you do, they are constants.
	double MAX_TRANSACTION_LIMIT = 50000.00;

	// 2. Abstract Methods (public abstract by default)
	// We don't need to type 'public abstract', Java adds it automatically.
	void pay(double amount);

	void getReceipt();
}