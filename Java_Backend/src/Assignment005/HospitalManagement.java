package Assignment005;

import java.time.LocalTime;
import java.util.Scanner;

public class HospitalManagement {
	public static void main(String args[]) {
	Scanner userInput = new Scanner(System.in);
	Hospital h1 = new Hospital("Hope Valley Hospital");
	
	while(true) {
		System.out.println("1) Add patients ");
		System.out.println("2) Treat patients");
		System.out.println("3) display Patients");
		System.out.println("4) Exit...");
		System.out.println("Enter your option: ");
		int options =userInput.nextInt();
		
		switch(options) {
		case 1:
			System.out.println("How many patient would you like to add ?");
			int count = userInput.nextInt();
			for(int i = 0 ; i < count ;i++) {
				userInput.nextLine();
				System.out.println("Enter the Patient Name : ");
				String name = userInput.nextLine();
				System.out.println("Enter the Patient severity Level (1 to 10): ");
				int severityLevel = userInput.nextInt();
				System.out.println("Enter the Patient arrival Time: ");
				System.out.println("Hour");
				int hour = userInput.nextInt();
				System.out.println("Minutes");
				int min= userInput.nextInt();
				Patient pat = new Patient(name,(byte)severityLevel,LocalTime.of(hour, min));
				h1.admitPatients(pat);				
			}
			break;
			
		case 2:
			h1.treatPatients();
			break;
			
		case 3:
			h1.displayPatients();
			break;
		case 4 :
			return;
		}
		
	}
}
}