import java.util.*;
public class Largest
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * Largest of 3 numbers
		 */
		int n1,n2,n3;
		System.out.println("Enter 3 numbers");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
			if(n1>n2 && n1>n3)
			{
				System.out.println(n1+"is largest");
			}
			else if(n2>n3)
			{
				System.out.println(n2+"is largest");
			}
			else
			{
				System.out.println(n3+"is largest");
			}
	
}

}
