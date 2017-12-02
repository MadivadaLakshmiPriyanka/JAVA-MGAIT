import java.util.Scanner;

public class NextPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Print Next Prime
		 */
	int flag=1,i,j;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=n+1;flag!=0;i++)
		{
			flag=0;
		
		for(j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				flag=1;
				break;
				}
		}
		
		if(flag==0)
		{
			System.out.println(i);
		
		}
		}

		
					
	}

}
