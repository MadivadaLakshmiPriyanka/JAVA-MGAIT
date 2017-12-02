import java.util.*;
public class OlaMainClass {
	public static void main(String args[])
	{
		/*
		 * if-else
		 */
		System.out.println("Enter the pin:");
	
		Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		if(pin==1234)
			System.out.println("Start driving");
		else
			System.out.println("Wrong Pin");
	}

}
