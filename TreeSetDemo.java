
import java.util.*;
/*
 * TREE SET DEMO
 */
public class TreeSetDemo 
{

	public static void main(String[] args) 
	{
		
		
				Set <Integer>set=new TreeSet<Integer>();
				set.add(10);
				set.add(3);
				set.add(90);
				set.add(34);
				set.add(2);
				/*Iterator it=set.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}*/
				for(Integer i:set)
				{
					System.out.println(i);
				}

	}

}


	