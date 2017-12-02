import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Display prime or not
		 */
int flag=1,i;
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=2;i<=n/2;i++)
{
	if(n%i==0)
	{
		flag=0;
		break;
		
	}

}

if(flag==0)
{
	System.out.println("Not Prime number");
}
else
{
	System.out.println("Prime number");
}
	
	}

}
