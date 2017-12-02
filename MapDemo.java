import java.util.*;
public class MapDemo
{

	public static void main(String[] args) 
	{
		Map <Integer,String>m=new HashMap<Integer,String>();
		m.put(101,"Priyanka");
		m.put(102, "ABC");
		m.put(103,"KLM");
		System.out.println("Enter id:");
		Scanner sc=new Scanner(System.in);
		String name=m.get(sc.nextInt());
		System.out.println(name);

	}

}
