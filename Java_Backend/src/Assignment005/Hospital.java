package Assignment005;

import java.util.PriorityQueue;

class Hospital {
    PriorityQueue<Patient> patientQueue;
String hospitalName;
     Hospital(String hospitalName) {
    	this.hospitalName=hospitalName;
    	patientQueue = new PriorityQueue<>(new severityComparator().thenComparing(new arrivalComparator()));
    }

     void admitPatients(Patient patient) {
        patientQueue.add(patient);
        System.out.println("Admitted: " + patient);
    }

  void treatPatients() {
        if (patientQueue.isEmpty()) {
            System.out.println("No patients to treat.");
        } else {
            Patient patient = patientQueue.poll();
            System.out.println("Treating: " + patient.name);
        }
    }

 void displayPatients() {
        if (patientQueue.isEmpty()) {
            System.out.println("No patients");
        } else {
            System.out.println("Current queue:");
			for (Patient patient : patientQueue) {
                System.out.println(patient);
            }
        }
    }
}