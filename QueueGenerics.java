package daysix.java.threads.com;

import java.util.*;

public class QueueClass {

	public static void main(String[] args) 
	{
		
		Queue<String> pq = new PriorityQueue<>();
		Queue<Number> numob = new PriorityQueue<>();
		  
        pq.add("firstElement");
        pq.add("secondElement");
        pq.add("thirdElement");
        
        numob.add(3);
        numob.add(4);
        numob.add(12);
        numob.add(34);
        numob.add(11);
        
        
        
  
        System.out.println("Elements in string type"+pq);
        System.out.println("Elemnts in num type"+numob);
        
        numob.remove(4);
        System.out.println("after remove from numob"+numob);
        
	}

}
