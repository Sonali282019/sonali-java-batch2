import java.util.TreeMap;

public class TestPhoneDirectoryWithTreeMap 
{
	static TreeMap<Integer, String> tm;
	  
   
    static void create()
    {
        
        tm= new TreeMap<Integer, String>();
  
        
    }
  
    
    static void insert()
    {
        
        tm.put(92046047, "Nitin");
        tm.put(62025504, "Rupa");
        tm.put(84347008, "Sonali");
        
    }
  
    
    static void search(int key)
    {
  
    	
        
        System.out.println( key + " present in"+ tm.containsKey(key));
    }
  
    
    static void search(String value)
    {
  
        
        System.out.println(value + "\" present in "+ tm.containsValue(value));
    }
  
   
    
    
    
  

	public static void main(String[] args) 
	{
		
		create();
		  
        
        insert();
  
        
        search(84347008);
  
        
        search("Sonali");
	}

}