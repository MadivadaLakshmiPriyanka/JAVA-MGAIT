import java.util.*;
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * GCD of 2 numbers
		 */
		int m,n,rem=0;
		System.out.println("Enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		while(n!=0)
		{
	    rem=m%n;
		m=n;
		n=rem;
		}
		if(rem==0)
		{
			System.out.println(m);
		}
	}

}
