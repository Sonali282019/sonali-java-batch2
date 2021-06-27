import java.util.ArrayList;

public class MaximumGeneric<T extends Number> {
	ArrayList<T> al = new ArrayList<T>();
public void add(T number){
	al.add(number);
}
public T largest(){
	T large = al.get(0);
	for (int i = 0; i < al.size(); i++){
		if(al.get(i).toString().compareTo(large.toString()) > 0)
			large = al.get(i);
	}
	return large;
}

public void display(){
	System.out.println(al);
}
}
