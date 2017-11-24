import java.io.*;
public class ExceptionDemo4 {

	public static void main(String[] args) throws IOException
	{
		try
		{
			int a=1/0;
			int arr[]={1,2,3,4};
			System.out.println(arr[3]);
			int k=Integer.parseInt("abcd");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		System.out.println("End of program");
	}

}
