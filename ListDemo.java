import java.util.*;
/*
 * LIST DEMO
 */
public class ListDemo 
{

	public static void main(String[] args)
	{
		List <String> l=new ArrayList<String>();//If it is Linkedlist the reading is slow;If it is vector it is syncronized.
		l.add("Manipal");
		l.add("Prolearn");
		l.add("Training");
		l.add("Prolearn");
		l.add(3,"World");
		l.remove("Prolearn");//Removes first prolearn
		System.out.println(l.contains("World"));
		System.out.println(l);//l.get(0)-gives respective index value
		for(String s:l)
		{
			System.out.println(s);
		}
	}

}
