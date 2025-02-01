package Assignment000;

abstract class User {
	int userId;
	String name;
	String email;
	User (int userId,String name,String email){
		this.userId=userId;
		this.name=name;
		this.email=email;
	}
	void login() {
		System.out.println("\n"+name+" logged in."); 
		
	}
	void logout() {
		System.out.println(name+" logged out.");
	}
	abstract void viewDashboard();
}
