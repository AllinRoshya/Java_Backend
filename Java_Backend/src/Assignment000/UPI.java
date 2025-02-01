package Assignment000;

class UPI implements PaymentMethod {

	public void pay(double amount) {
        System.out.println("\nPaid $" + amount + " using UPI.");
    }

    public void refund(double amount) {
        System.out.println("Refunded $" + amount + " to UPI.");
    }

    public boolean authenticate() {
        System.out.println("UPI authenticated.");
        return true; 
    }
	
}
