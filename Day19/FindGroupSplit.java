import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Split
{
	public static void split(String str)
	{
		System.out.println("Split()");
		System.out.println("String is"+str);
		
		for (String retval: str.split("-")) {
	         System.out.println(retval);
		}
	}
}
class Find
{
	public static void find()
	{
		Pattern p=Pattern.compile("while");  
        Matcher m=p.matcher("findwhilefindexcusewhileyeswhile");  
        int c=0;  
        System.out.println("Find()");
        while(m.find())  
        {  
        c=c+1;  
        }
        System.out.println(" Number of matches : "+c);  
	}
}
class Group
{
	public static void group()
	{
		String text    =
                "John writes about this, and John writes about that," +" and John writes about everything. ";
              
		String ps = "(John)";

		System.out.println("group()");
		
        Pattern pattern = Pattern.compile(ps);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println("found: " + matcher.group(1));
        }
		
	}
}
public class FindGroupSplit 
{

	public static void main(String[] args) 
	{
		Split s=new Split();
		s.split("hello from main");
		Find f=new Find();
		f.find();
		Group g=new Group();
		

	}

}