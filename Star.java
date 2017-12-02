import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Print stars as per given number
		 */
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	System.out.print("*");
}
	}

}
