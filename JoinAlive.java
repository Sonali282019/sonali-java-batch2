package daysix.java.threads.com;

public class JoinAlive {

	public static void main(String[] args) throws Exception
	{
		Thread t1=new Thread(() ->
		{
			for(int i=0;i<4;i++)
			{
				System.out.println("in thread 1");
				
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
			}
		}
				
				);
		
		Thread t2=new Thread(() ->
		{
			for(int i=0;i<4;i++)
			{
				System.out.println("in thread 2");
				
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
			}
		}
				
				);
		
		t1.start();
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("check t1 alive::"+t1.isAlive());
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("check t1 alive after t1.join()::"+t1.isAlive());
		System.out.println("in main thread");
		

	}

}
