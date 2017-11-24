import java.io.*;
class TrainingException extends Exception
{
	
}
class LightGoneException extends TrainingException
{
	
}
class Monkey 
{
	public void jumps() throws TrainingException
	{
	System.out.println("Monkey jumps");
	}
	
}
class Ape extends Monkey
{
	public void jumps() throws LightGoneException
	{
		System.out.println("Ape jumps");
	}
}
public class ExceptionDemo7 
{

	public static void main(String[] args) 
	{
		

	}

}
