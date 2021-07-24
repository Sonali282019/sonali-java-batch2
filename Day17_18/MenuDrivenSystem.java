//import Scanner as we require it.
import java.util.Scanner;

// the name of our class its public
public class MenuDrivenSystem {
//void main
public static void main (String[] args)
{
//declare float
float a,b,area = 0;
char choice;
//Declare input as scanner
Scanner input = new Scanner(System.in);

//Take inputs
System.out.println("Enter c for circle.");
System.out.println("Enter s for square.");
System.out.println("Enter r for rectangle.");
System.out.println("Enter t for triangle.");
String s = input.next();
choice = s.charAt(0);

//add a switch statement
switch(choice)
{
case 'c':
System.out.println("Enter radius:");
a = input.nextFloat();
area = 3.14f*a*a;
break;
case 's':
System.out.println("Enter side:");
a = input.nextFloat();
area = a*a;
break;
case 'r':
System.out.println("Enter length and breadth:");
a = input.nextFloat();
b = input.nextFloat();
area = a*b;
break;
case 't':
System.out.println("Enter base and height:");
a =input.nextFloat();
b =input.nextFloat();
area = 0.5f*a*b;
break;
default:
System.out.println("Error");
}

System.out.println("Area = "+area);
}
}