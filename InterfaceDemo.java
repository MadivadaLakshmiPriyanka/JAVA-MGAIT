import java.util.concurrent.SynchronousQueue;

interface FlyingObject
{
	public void fly();
	public void takeOff();
	public void land();
	public final double PI=3.141;
}
class UFO implements FlyingObject
{

	@Override
	public void fly() 
	{
		
		System.out.println("UFO is flying");
	}

	@Override
	public void takeOff() 
	{
		
		System.out.println("UFO is taking off");
	}

	@Override
	public void land()
	{
		
		System.out.println("UFO is landing");
	}
	
}
public class InterfaceDemo
{

	public static void main(String[] args) 
	{
		FlyingObject obj=new UFO();
		obj.fly();
		UFO obj1=new UFO();
		if(obj1 instanceof UFO)
		{
		System.out.println("TRUE");	
		}
		else
		{
			System.out.println("FALSE");
		}
			
			
	}

}
