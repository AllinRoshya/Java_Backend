package Assignment000;

interface PaymentMethod {

	void pay(double amount);
	void refund(double amount);
	boolean authenticate();
	
}
