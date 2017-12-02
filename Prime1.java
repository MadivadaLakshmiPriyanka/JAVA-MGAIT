import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Prime numbers b/w 2 numbers
		 * 
		 */
		System.out.println("Enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int n=n1;n<=n2;n++)
		{
			
			int flag=1;
		for(int i=2;i<=n/2;i++)
		{
			
			if(n%i==0)
			{
				flag=0;
				
			}

		}

		if(flag==1)
		{
			
			System.out.println(n);
		}
		
		}
	}

}
