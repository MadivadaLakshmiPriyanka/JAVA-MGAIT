import java.util.*;
public class OlaCab {
	public static void main(String args[])
	{
		/*
		 * Selection of ola cabs using IF-ELSE
		 */
		System.out.println("Enter type of cab:");
		Scanner sc=new Scanner(System.in);
		char cab=sc.next().charAt(0);
		System.out.println("You entered"+cab);
if(cab=='m')
	System.out.println("You have selected Mini Cab");
else if(cab=='i')
System.out.println("You have selected Micro Cab");
else if(cab=='s')
System.out.println("You have selected Share Cab");
else if(cab=='a')
System.out.println("You have selected Auto ");
else if(cab=='p')
System.out.println("You have selected Prime Cab");
else 
System.out.println("You have selected wrong Cab.Please select right Cab");

	}

}
