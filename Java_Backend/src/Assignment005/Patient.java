package Assignment005;

import java.time.LocalTime;
import java.util.Comparator;

public class Patient {
	String name;
	byte severityLevel;
	LocalTime arrivalTime;

	Patient(String name, byte severityLevel, LocalTime arrivalTime) {
		this.name = name;
		this.severityLevel = severityLevel;
		this.arrivalTime = arrivalTime;
	}

	String getName() {
		return name;
	}

	int getSeverityLevel() {
		return severityLevel;
	}

	LocalTime getArrivalTime() {
		return arrivalTime;
	}
	@Override
    public String toString() {
        return "\nPatient Name: " + name +
                "\nSeverity Level: " + severityLevel +
                "\nArrival Time: " + arrivalTime;
    }
}
  
