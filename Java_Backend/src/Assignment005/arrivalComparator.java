package Assignment005;

import java.util.Comparator;


class arrivalComparator implements Comparator<Patient>{
	@Override
    public int compare(Patient p1, Patient p2) {
    return p2.getArrivalTime().compareTo(p1.getArrivalTime());
}
}
