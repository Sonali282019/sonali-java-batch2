
import java.util.*;

 class ABC {
	public static void main(String[] args)
	{
		try {
			ArrayList<String> list = new ArrayList<>();
			
			list.add("A");
			list.add("B");
			list.add("C");
			list.add("D");
			System.out.println(list);
			
			list.set(2, "E");
			System.out.println(list);
			list.set(6, "z");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
