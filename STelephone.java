package day3.java.inheritance.com;

abstract class Telephone
{
	abstract void lift();
	abstract void disconnected();
}
class SmartTelephone extends Telephone
{

	@Override
	void lift() 
	{
		System.out.println("implemented lift method in telephone class");
		
		
	}

	@Override
	void disconnected() 
	{
		System.out.println("implemented disconnected() in telephone class");
		
	}
	
}
public class STelephone {

	public static void main(String[] args) 
	{
		SmartTelephone stob=new SmartTelephone();
		stob.disconnected();
		stob.lift();
		

	}

}
