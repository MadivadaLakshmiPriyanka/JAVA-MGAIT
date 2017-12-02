import java.util.*;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * Display individual characters from string
 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
	}

}
