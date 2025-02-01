package Assignment000;

class MainApp {
	public static void main(String args[]) {
		Admin admin = new Admin(1, "Allin Roshya", "allin@gmail.com");
		Customer customer = new Customer(2, "Manimekala", "mani@gmail.com");
		admin.login();
		admin.viewDashboard();
		admin.logout();

		customer.login();
		customer.viewDashboard();
		customer.placeOrder();
		customer.cancelOrder();
		customer.trackOrder();
		customer.logout();

		PaymentMethod creditCard = new CreditCard();
		PaymentMethod upi = new UPI();

		creditCard.pay(200);
		creditCard.refund(80);
		creditCard.authenticate();

		upi.pay(650);
		upi.refund(340);
		upi.authenticate();

	}
}
