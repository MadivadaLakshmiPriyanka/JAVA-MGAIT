/*
 * Exception Demo with throwable methods
 */
import java.io.*;
class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String str)
	{
		super(str);
	}
}
public class ExceptionDemo1 {

	public static void main(String[] args)  throws IOException
	{
		try
		{
			double balance=2000;
			if(balance<10000)
			{
				throw new InsufficientBalanceException("HI");
				
			}
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println("Exception handled");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("End of transaction");
	}

}
