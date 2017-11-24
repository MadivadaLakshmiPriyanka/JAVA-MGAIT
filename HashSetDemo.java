import java.util.*;
/*
 * HASH SET DEMO
 */
public class HashSetDemo
{

	public static void main(String[] args)
	{
		Set set=new HashSet();
		set.add(10);
		set.add(3);
		set.add(90);
		set.add(34);
		set.add(2);
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
