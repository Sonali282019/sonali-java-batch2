package day3.java.inheritance.com;

class Publication
{
	public String title;
	public int price;
	
	Publication(String title,int price)
	{
		this.title=title;
		this.price=price;
				
	}
	
	
}
class Book extends Publication
{
	public int pgno;

	Book(int pgno,String title,int price) {
		
		super(title,price);
		this.pgno=pgno;
	}
	void display()
	{
		System.out.println("BOOK Details");
		System.out.println("Title"+" "+title);
		System.out.println("Price"+" "+price);
		System.out.println("Pages"+" "+pgno);
	}
	
}

class CD extends Publication
{
	public int time;
	CD(int time,String title,int price)
	{
		super(title,price);
		this.time=time;
	}
	void display()
	{
		System.out.println("\n \n");
		System.out.println("CD Details");
		System.out.println("Title"+" "+title);
		System.out.println("Price"+" "+price);
		System.out.println("Time"+" "+time);
	}
}

public class BookPublisher {

	public static void main(String[] args) 
	{
		
		Book boj=new Book(590,"Pride and Prejudice",12);
		CD coj=new CD(24,"Pride and Prejudice",1200);
		boj.display();
		coj.display();
		

	}

}
