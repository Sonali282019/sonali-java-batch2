// Java program to check whether an element
// is present in an ArrayList

// importing package
import java.util.*;
class check {
	public static void main(String[] args)
	{
		// Creating an ArrayList of String type
		List<String> GFG = new ArrayList<String>();

		// Adding elements to the ArrayList
		GFG.add("Welcome");
		GFG.add("To");
		GFG.add("Geeks");
		GFG.add("For");
		GFG.add("Geeks");

		// Using contains() method to check whether the
		// particular
		// element is present in the List or not
		System.out.println(GFG.contains("Welcome"));
		System.out.println(GFG.contains("Java"));
	}
}
