class Gen<T>
{
T ob;
Gen()
{
ob=new T(); 
}
}

class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    
}

public class MobileDevice<T> {
    private static T os;
}

class SmartPhone
{
  String brand;
int cost;
Student(String n,int s)
{
brand=n;
cost=s;
}
public String toString()
{
return brand+" "+cost;
}
}

class Pager
{
  int Frequency;
int speed;
Student(String n,int s)
{
frequency=n;
speed=s;
}
public String toString()
{
return frequency+" "+speed;
}
}

class Tablet
{
  int weight;
int mAh;
Student(String n,int s)
{
weight=n;
mAh=s;
}
public String toString()
{
return weight+" "+mAh;
}
}

public class ResrictionsGenerics
{
  public static void main(String arg[])
  {
    Gen<Integer> genob=new Gen<>();
    
    Pair<int, char> p = new Pair<>(8, 'a'); 
    
    MobileDevice<Smartphone> phone = new MobileDevice<>();
    
    MobileDevice<Pager> pager = new MobileDevice<>();
    
    MobileDevice<TabletPC> pc = new MobileDevice<>();
    
  }
}
  
