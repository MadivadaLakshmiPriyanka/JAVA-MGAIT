import java.io.*;
/*
 * Demo to show base exception in catch block can hanle any child exceptions thrown from try
 */
public class ExceptionDemo6 {

	public static void main(String[] args) throws IOException
	{
		try
		{
			throw new FileNotFoundException();
			
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("Hi");
		}
		catch(IOException e)
		{
			System.out.println("Hello");
		}
		System.out.println("End");
	}

}
