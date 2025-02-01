package Assignment005;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SetMethods {
	static final String RESET = "\u001B[0m";
    static final String GREEN = "\u001B[32m";
	public static void main(String[] args) {
		 HashSet<Integer> set1 = new HashSet<>();
	        set1.add(1);
	        set1.add(2);
	        set1.add(3);

	        HashSet<Integer> set2 = new HashSet<>();
	        set2.add(2);
	        set2.add(3);
		        // 1. Check if one set is a subset of another
		        boolean isSubset = set1.containsAll(set2);
		        System.out.println(GREEN+"1. Is set2 a subset of set1? "+RESET + isSubset);

		        // 2. Perform the union operation 
		        HashSet<Integer> unionSet = new HashSet<>(set1);
		        unionSet.addAll(set2);
		        System.out.println(GREEN+"2. Union of set1 and set2: "+RESET + unionSet);

		        // Find the intersection of two sets
		        HashSet<Integer> intersectionSet = new HashSet<>(set1);
		        intersectionSet.retainAll(set2);
		        System.out.println(GREEN+"Intersection of set1 and set2: "+RESET + intersectionSet);

		        // 3. Subtract one set from another 
		       HashSet<Integer> differenceSet = new HashSet<>(set1);
		        differenceSet.removeAll(set2);
		        System.out.println(GREEN+"3. Difference of set1 and set2: " +RESET+ differenceSet);

		        // 4. Copy the contents of one set to another set
		        HashSet<Integer> copiedSet = new HashSet<>(set1);
		        System.out.println(GREEN+"4. Copied set: " +RESET+ copiedSet);

		        // 5. What happens when calling add() with an existing element
		        boolean wasAdded = set1.add(3);
		        System.out.println(GREEN+"5. Was element '3' added to set1? "+RESET + wasAdded);
		        System.out.println(GREEN+"Set 1: "+RESET + set1);

		        // 6. Convert a Set to a List or array
		        ArrayList<Integer> listFromSet = new ArrayList<>(set1);
		        Integer[] arrayFromSet = set1.toArray(new Integer[0]);
		        System.out.println(GREEN+"6. List converted from set1: "+RESET + listFromSet);
		        System.out.println(GREEN+"Array converted from set1: "+RESET + Arrays.toString(arrayFromSet));

		        // 7. Significance of conversion
		        System.out.println(GREEN+"7. Significance: A List or Array allows duplicate elements and maintains order."+RESET);

		        // 8. Check if two sets contain the same elements 
		        HashSet<Integer> anotherSet = new HashSet<>(set1);
		        boolean areEqual = set1.equals(anotherSet);
		        System.out.println(GREEN+"8. Are set1 and anotherSet equal? "+RESET + areEqual);

		        // 9. Use containsAll() to check if one set contains all elements of another
		        boolean containsAll = set1.containsAll(set2);
		        System.out.println(GREEN+"9. Does set1 contain all elements of intersectionSet? "+RESET + containsAll);

		        // 10. Create a copy of a Set using clone()
		        HashSet<Integer> clonedSet =  (HashSet<Integer>) new HashSet<>(set2).clone(); 
		        System.out.println(GREEN+"10. Cloned set: "+RESET + clonedSet);
		        System.out.println(GREEN+"Set 2: "+RESET+set2);
		    

	}

}