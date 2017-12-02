import java.util.*;
public class SearchNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Search number in the given array
		 */
Scanner sc=new Scanner(System.in);
int arr[]=new int[10];
System.out.println("Enter 10 numbers");
for(int i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
	
}
System.out.println("Enter the item to find");
int item=sc.nextInt();
int j;
for(j=0;j<arr.length;j++)
{
	if(item==arr[j])
	{
		System.out.println("Item found");
		System.out.println("At location"+j);
		break;
	}
}
if(j==arr.length)
{
	System.out.println("Item not found");
}
	}

}
