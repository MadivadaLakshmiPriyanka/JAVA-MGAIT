import java.util.Scanner;

public class Pin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Accept pin from user & Block the account if passwod is entered
		 * wrong for 3 times
		 */
		int count=1;
System.out.println("Enter pin");
Scanner sc=new Scanner(System.in);
int pin=sc.nextInt();
for(int i=0;i<count;i++)
{
if(pin==1234)
{
	System.out.println("SUCCESFUL LOGIN");
}
else
{
	count++;
	System.out.println("WRONG PIN.Please enter valid pin");
	pin=sc.nextInt();
	if(count==3)
	{
		System.out.println("ACCOUNT LOCKED");
		break;
	}
	
}

}
	}

}
