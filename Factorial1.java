import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Factorial of n1 is n2
		 */
		int n1,n2,fact=1;
		System.out.println("Enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		
			while(n1>1)
			{
			fact=fact*n1;
			n1=n1-1;
			}
		if(n2==fact)
		{
			System.out.println("n2 is factorial of n1");
		}
		else
		{
			System.out.println("n2 is not a factorial of n1");
		}

	}

}
