import java.util.*;
class Planet
{
	int noOfMoons,rotationTime,revolutionTime;
	String nameOfPlanet;
	double distanceFromSun;
		void rotate()
		{
	
		}
		void revolve()
		{
	
		}
}
class Earth1 extends Planet
{
	void releaseOxygen()
	{
		
	}
	void maintainAtmosphere()
	{
		
	}
	void maintainLivingBeings()
	{
		
	}
class Moon
{
	void presence()
	{
		System.out.println("it is a satelite");
	}
}
}	
class Sun
{
	int temparature,radius;
	void shine()
	{
		
	}
}
class Animal 
{
	String name;
	int gender;
	void reproduce()
	{
		
	}
}
class Mammel extends Animal
{
	
}
class Mann extends Mammel
{
	
}
class Person extends Mann
{
	
}
class Student extends Person
{
	String name;
	int id;
	String subject;
	void doExcerciseOnTime()
	{
		System.out.println("The given excercise is completed by me");
	}
}
class Earth
{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.doExcerciseOnTime();
	}
}

	
		

