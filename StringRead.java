import java.io.*;
public class StringRead {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ur name with space");
		String str=br.readLine();
		System.out.println("My name is "+str);
	}

}
