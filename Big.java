import java.util.Scanner;

public class Big {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Biggest of 2 Numbers
		 */
		System.out.println("enter first number");
				Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println("enter second number");

		int n2=sc.nextInt();
		if(n1>n2)
		{
			System.out.println(n1 +"IS BIGGER");
			
		}
		else
		{
			System.out.println(n2 +"IS BIGGER");
		}
	}


}
