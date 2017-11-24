import java.io.*;
class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String str)
	{
		super(str);
	}
}
public class ExceptionDemo2
{

		/*
		 * Exception Demo with throwable methods
		*/
		public static void transaction() throws InsufficientBalanceException 
		 {
				
					double balance=2000;
					if(balance<10000)
					{
						throw new InsufficientBalanceException("HI");
						
					}
	      }
		public static void main(String[] args) throws IOException
		 {
			try
			{
				transaction();
			}

				catch(InsufficientBalanceException e)
				{
					System.out.println("Exception handled");
					
					e.printStackTrace();
				}
				
			}

		}


	