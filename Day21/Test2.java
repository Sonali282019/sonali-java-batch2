// Java program to demonstrate Implementation of
// functional interface using lambda expressions

class Test2
{
public static void main(String args[])
{

	// lambda expression to create the object
	new Thread(()->
	{System.out.println("New thread created");}).start();
}
}
