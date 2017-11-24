import java.io.IOException;

public class ExceptionDemo5 {

	public static void main(String[] args) throws IOException
			{
				try
				{
					int a=1/0;
					int arr[]={1,2,3,4};
					System.out.println(arr[3]);
					int k=Integer.parseInt("abcd");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				System.out.println("End of program");
			}

		}

	
