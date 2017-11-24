abstract class Robot
{
	public abstract void walk();
	public abstract void talk();
	
}

abstract class HumanoiRobot extends Robot
{
	public abstract void intelligence();
}

class RoboCop extends HumanoiRobot
{
	public void walk() 
	{
		System.out.println("Robot walking");
		
	}
	public void talk()
	{
		System.out.println("Robot talking");
		
	}
		public void intelligence()
	{
		
		System.out.println("Robot thinking");
	}
	
}

class Chitti extends Robot
{
	private void hasAFriend()
	{
		System.out.println("Aishwarya");
	}
	public void walk()
	{
		System.out.println("Chitti is walking");
	}
	public void talk()
	{
		System.out.println("Rajinikanth style talking");
	}
}
public class AbstractDemo 
{

	public static void main(String[] args)
	{
		Robot r=new Chitti();
		
		r.talk();
		r.walk();
		
		

	}

}
