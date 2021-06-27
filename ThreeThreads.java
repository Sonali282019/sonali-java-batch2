package daysix.java.threads.com;

import java.util.Random;


public class ThreeThreads {

	public static void main(String[] args) 
	{
		RandomNumberThread rt = new RandomNumberThread();
		rt.start();
		

	}

}
