//Arithmetic Exception
public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Begin");
		try
		{
		System.out.println(1/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
		}
		System.out.println("End");
		

	}

}
