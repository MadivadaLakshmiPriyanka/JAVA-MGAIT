import java.util.*;
public class Factorial 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
/*
 * Factorial of given number
 */
		int n,fact=1;
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
			while(n>1)
			{
			fact=fact*n;
			n=n-1;
			}
		System.out.println(fact);

	}

}
