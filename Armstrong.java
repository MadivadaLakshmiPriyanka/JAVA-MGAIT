import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Armstrong
		 * 
		 */
		int sum=0;
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int num=n;

	while(n>0)
	{
		int rem=n%10;
		n=n/10;
		int n1=rem*rem*rem;
		sum=sum+n1;
		
	}
	if(sum==num)
	System.out.println(sum+"Armstrong");
	else
		System.out.println("Not Armstrong");

	}

}
