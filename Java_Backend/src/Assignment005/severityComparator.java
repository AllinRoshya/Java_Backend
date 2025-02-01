package Assignment005;

import java.util.Comparator;


public class severityComparator implements Comparator<Patient>{
	@Override
 public int compare(Patient p1, Patient p2) {
         return Integer.compare(p2.getSeverityLevel(), p1.getSeverityLevel());
     }
 }