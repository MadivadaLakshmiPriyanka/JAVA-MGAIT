import java.io.*;
import java.util.*;
public class StreamDemo1 
{

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter quote for the day:");
		String quote=sc.nextLine();
		FileWriter fw=null;
		try
		{
		String file="E:/StreamDemo/quote.txt";
		fw=new FileWriter(file,true);
		fw.write(quote);
		fw.write("\n");
		System.out.println("Quote is written");
		}
		catch(IOException e)
		{
			
		}
		finally
		{
			try
			{
				fw.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
		
	}

}
