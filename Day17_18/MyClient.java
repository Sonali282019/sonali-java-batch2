import java.io.*;
import java.net.*;

public class MyClient {
public static void main(String[] args) {
try{	
Socket s=new Socket("localhost",6000);
	
DataOutputStream dout=new DataOutputStream(s.getOutputStream());

dout.writeUTF("I am from client side");
dout.flush();

dout.close();
s.close();

}catch(Exception e)
{
    System.out.println(e);
}
}
}
import java.io.*;
import java.net.*;

public class MyClient {
public static void main(String[] args) {
try{	
Socket s=new Socket("localhost",6000);
	
DataOutputStream dout=new DataOutputStream(s.getOutputStream());

dout.writeUTF("I am from client side");
dout.flush();

dout.close();
s.close();

}catch(Exception e)
{
    System.out.println(e);
}
}
}
