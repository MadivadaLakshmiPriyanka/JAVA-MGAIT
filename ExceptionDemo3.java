import java.io.*;
/*
 * Finally demo
 * 
 */
public class ExceptionDemo3 {

	public static void main(String[] args)
	{
		try
		{
			int a=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside Catch");
		}
		finally
		{
			System.out.println("Inside finally");
		}

	}

}
