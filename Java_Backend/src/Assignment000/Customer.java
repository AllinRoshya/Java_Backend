package Assignment000;

class Customer extends User implements OrderActions{
	Customer(int userId,String name,String email){
		super(userId,name,email);
	}
		void viewDashboard() {
			System.out.println("Customer Dashboard");
		}
		public void placeOrder() {
			System.out.println("Order placed.");
		}
		public void cancelOrder() {
			System.out.println("Order cancelled.");
		}
		public void trackOrder() {
			System.out.println("Order tracked.");
		}
}
