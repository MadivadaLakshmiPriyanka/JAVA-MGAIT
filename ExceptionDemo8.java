import java.io.*;
class Exc0 extends Exception
{
	
}
class Exc1 extends Exc0
{
	
}
public class ExceptionDemo8 {

	public static void main(String[] args) {
	try
	{
		throw new Exc1();
		
	}
	catch(Exc0 e0)
	{
		System.out.println("EXo caught");
	}
	catch(Exception e)
	{
		System.out.println("Exception caught");
	}

	}

}
