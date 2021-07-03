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

	
	public void MagicKey() 
	{
		System.out.println("SimpleSet enabled");
		
	}

	
	public void IrRf() 
	{
		System.out.println("IR Remote");
		
		
	}

	
	public void Frequency() {
		System.out.println("300 mHz - 400 gHz");
		
		
	}
	
}

public class interface_Tv {

	public static void main(String[] args) 
	{
		System.out.println("Features");
		TV tvob=new TV();
		tvob.Frequency();
		tvob.IrRf();
		tvob.MagicKey();
		
	}

}