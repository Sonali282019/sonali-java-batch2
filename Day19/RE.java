import java.lang.Class;
import java.lang.reflect.*;

class Dog {
  public String type;
}

class RE {
  public static void main(String[] args) {
    try {
      
      Dog d1 = new Dog();

      
      // using getClass()
      Class obj = d1.getClass();

      Field field1 = obj.getField("type");
      field1.set(d1, "labrador");

     
      String typeValue = (String) field1.get(d1);
      System.out.println("Value: " + typeValue);

      
      int mod = field1.getModifiers();

      
      String modifier1 = Modifier.toString(mod);
      System.out.println("Modifier: " + modifier1);
      System.out.println(" ");
    }
    
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}