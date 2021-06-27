package daysix.java.threads.com;

public class DeadLock {

	public static void main(String[] args) throws Exception
	{
		 String resource1 = "resourceone";  
	     String resource2 = "resourcetwo";  
	    
	    Thread t1 = new Thread()
	    {  
	      public void run() 
	      {  
	          synchronized (resource1) {  
	           System.out.println("T1 locked resource 1");  
	  
	           try 
	           {
	        	   Thread.sleep(100);
	        	   } 
	           catch (Exception e) {}  
	  
	           synchronized (resource2) 
	           {  
	            System.out.println("T1 locked resource 2");  
	           }  
	         }  
	      }  
	    };  
	  
	    
	    Thread t2 = new Thread() 
	    {  
	      public void run() 
	      {  
	        synchronized (resource2)
	        {  
	          System.out.println("T2 locked resource 1");  
	  
	          try
	          {
	        	  Thread.sleep(100);
	        	  } 
	          catch (Exception e) {}  
	  
	          synchronized (resource1) 
	          {  
	            System.out.println("T2: locked resource 2");  
	          }  
	        }  
	      }  
	    };  
	  
	      
	    t1.start();  
	    t2.start();  
	    
//	    t1.join();
//	    t2.join();
//	    
//	    System.out.println("DeadLock situation");
	    
	    
		

	}

}
