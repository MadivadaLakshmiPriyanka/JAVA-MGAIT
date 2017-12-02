import java.util.*;
public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Sum of the digits in a given number 
		 */
		int n,sum=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			int rem=n%10;
			n=n/10;
			sum=sum+rem;
		}
		System.out.println(sum);
	}

}
