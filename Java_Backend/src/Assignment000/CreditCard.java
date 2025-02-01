package Assignment000;

class CreditCard implements PaymentMethod{
	public void pay(double amount) {
        System.out.println("\nPaid $" + amount + " using Credit Card.");
    }

    public void refund(double amount) {
        System.out.println("Refunded $" + amount + " to Credit Card.");
    }

    public boolean authenticate() {
        System.out.println("Credit Card authenticated.");
        return true; 
    }
}
