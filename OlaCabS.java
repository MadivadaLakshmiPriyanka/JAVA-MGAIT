import java.util.Scanner;

public class OlaCabS {
	public static void main(String args[])
	{
		/*
		 * Selection of Ola cabs using Switch Case
		 */
		System.out.println("Enter type of cab:");
		Scanner sc=new Scanner(System.in);
		char cab=sc.next().charAt(0);
		System.out.println("You entered"+cab);
		switch(cab)
		{
		case 'm':System.out.println("You have selected Mini Cab");
					break;
		case 'i':System.out.println("You have selected Micro Cab");
					break;
		case 's':System.out.println("You have selected Share Cab");
					break;
		case 'a':System.out.println("You have selected Auto ");
					break;
		case 'p':System.out.println("You have selected Prime Cab");
					break;
		default:System.out.println("You have selected wrong Cab.Please select right Cab");

		}
	
	}

}
