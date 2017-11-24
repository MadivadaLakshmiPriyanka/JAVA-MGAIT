import java.io.*;
public class ExceptionPropagation 
{
	public static void m1() throws Exception
	{
		throw new Exception();
	}
	public static void m2() throws Exception
	{
		m1();
	}
	
	
	public static void main(String[] args) 
	{
		try
		{
			m2();
			
		}
		catch(Exception e)
		{
			
		}
		System.out.println("EXCEPTION PROPAGATION");

	}

}
