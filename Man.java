/*
 * Method Overloading
 */
class Man1 
{
	public void eating()
	{
		System.out.println("Eating normally");
	}
	public void eating(int noOfSpoons)
	{
		System.out.println("Eating with "+noOfSpoons+" spoons");
	}
	public void eating(int noOfSpoons,String time)
	{
		System.out.println("Eating with "+noOfSpoons+" spoons");
		System.out.println("Eating at "+time);
	}
}
public class Man
{
	public static void main(String[] args)
	{
		Man1 m=new Man1();
		m.eating();
		m.eating(2);
		m.eating(2,"1 pm");
	}

}

