import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



class GetHash
{
	public static void  hashVal()
	{
		HashMap<Integer,String> hmap = new HashMap<Integer,String> ();
      
		Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) 
        {
        	System.out.println("Enter Key:");
            Integer a = in.nextInt();
            System.out.println("Enter Value:");
            String b = in.next();

            hmap.put(a, b);
        }

        for (Map.Entry<Integer, String> m : hmap.entrySet()) 
        {
            System.out.println("Key::"+m.getKey() + " " +"Value::"+ m.getValue());
        }
		
		
		
	}
}

public class HashMap {

	public static void main(String[] args) 
	{
       GetHash al=new GetHash();
		
		al.hashVal();

	}

}