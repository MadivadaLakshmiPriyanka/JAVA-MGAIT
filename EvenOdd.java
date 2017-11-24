import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Even OR Odd
		 */
		int n;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}

}
