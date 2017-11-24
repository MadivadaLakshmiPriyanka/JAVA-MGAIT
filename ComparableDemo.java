import java.util.*;
/*
 * COMPARABLE DEMO
 */
class Studen implements Comparable
{
	int roll;
	double marks;
	String name;
	Studen(int roll,double marks,String name)
	{
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public int compareTo(Object obj)
	{
		Studen s=(Studen)obj;
		/*if(this.marks>s.marks)
			return 1;
		else if(this.marks<s.marks)
			return -1;
		else
		return 0;*/
		return this.name.compareTo(s.name);
	}
}
public class ComparableDemo
{

	public static void main(String[] args)
	{
		Studen s1=new Studen(2,75,"Priyanka");
		Studen s2=new Studen(29,90,"Ravali");
		Studen s3=new Studen(19,95,"Naziya");
		List<Studen> l=new ArrayList<Studen>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		Collections.sort(l);
		for(Studen s:l)
		{
			System.out.println(s.roll+" "+s.marks+" "+s.name);
		}
	}

}
