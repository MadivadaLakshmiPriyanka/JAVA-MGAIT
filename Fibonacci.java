
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fibonacci Series
		 */
int a=0,b=1,sum=0;
for(int i=1;sum<=100;i++)
{
	System.out.println(sum);
	a=b;
	b=sum;
	sum=a+b;
	
}
	}

}
