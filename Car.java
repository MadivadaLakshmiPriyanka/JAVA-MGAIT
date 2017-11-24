import java.util.*;
/*
 * Car implementation	
 */
 class Car1
{
	 	String regNo;
		String brand;
		String colour;
		void showCarDetails()
		{
			System.out.println("Regno:"+regNo);
			System.out.println("Brand:"+brand);
			System.out.println("Colour:"+colour);
		}
		void start()
		{
			System.out.println("Car Started");
		}
}
class Driver
{
	String licenceNo;
	String name;
	void driveCar()
	{
		Car1 c=new Car1();
		c.regNo="KA03-HZ-8978";
		c.colour="White";
		c.brand="Honda City";
		c.showCarDetails();
		c.start();
	}
}
class Car
{
	public static void main(String[] args)
	{
		Driver d=new Driver();
		d.driveCar();
	}
}
	


