import java.util.*;
public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * Biggest NUMBER
		 */
		int num[]=new int[5];
		int max=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 numbers");
for(int i=0;i<5;i++)
{
	num[i]=sc.nextInt();
	if(num[i]>max)
		max=num[i];
}
System.out.println("Max is"+max);
	}

}
