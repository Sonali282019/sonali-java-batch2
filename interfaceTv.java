package day3.java.inheritance.com;

interface TVRemote
{
	void MagicKey();
	void IrRf();
}
interface SmartTvRemote extends TVRemote
{
	void Frequency();
}
class TV implements SmartTvRemote
{

	@Override
	public void MagicKey() 
	{
		System.out.println("SimpleSet enabled");
		
	}

	@Override
	public void IrRf() 
	{
		System.out.println("IR Remote");
		
		
	}

	@Override
	public void Frequency() {
		System.out.println("300 mHz - 400 gHz");
		
		
	}
	
}

public class interfaceTv {

	public static void main(String[] args) 
	{
		System.out.println("Features");
		TV tvob=new TV();
		tvob.Frequency();
		tvob.IrRf();
		tvob.MagicKey();
		
	}

}
