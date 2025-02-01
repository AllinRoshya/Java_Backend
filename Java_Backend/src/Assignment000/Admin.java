package Assignment000;

class Admin extends User{
Admin(int userId,String name,String email){
	super(userId,name,email);
}
	void viewDashboard() {
		System.out.println("Admin Dashboard");
	}
}
