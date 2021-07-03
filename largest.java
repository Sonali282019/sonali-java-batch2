
import java.util.*;

public class largest {
	public static void main(String args[]) throws Exception
	{
Set<Integer> set = new HashSet<Integer>();

		set.add(3);
		set.add(6);
		set.add(2);
		set.add(9);

		System.out.println("Set: " + set);

		int minSet = Collections.min(set);

		int maxSet = Collections.max(set);

		System.out.println("Minimum value of set is: "
						+ minSet);

		System.out.println("Maximum value of set is: "
						+ maxSet);
	}
}
