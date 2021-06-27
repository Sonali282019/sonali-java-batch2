package day2_java.prgm.clas.com;

public class Room 
{
	int roomno;
	String roomtype;
	int roomarea;
	boolean ac;
	
	void SetData(int no,String type,int area,boolean isac)
	{
		roomno=no;
		roomtype=type;
		roomarea=area;
		ac=isac;
	}
	void DisplayData()
	{
		System.out.println("room number:"+roomno);
		System.out.println("room type:"+roomtype);
		System.out.println("room area:"+roomarea);
		System.out.println("ac:"+ac);
	}

	public static void main(String[] args) 
	{
		Room roomobject=new Room();
		roomobject.SetData(201,"RoyalSuite",350 , false);
		roomobject.DisplayData();
	}

}
