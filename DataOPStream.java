import java.io.*;
import java.util.*;
//DataOutputStream to write primitive data types to file
public class DataOPStream {

	public static void main(String[] args)  throws Exception
	{
		String path="E:/StreamDemo/student.dat";
		FileOutputStream f=new FileOutputStream(path,true);
		DataOutputStream d=new DataOutputStream(f);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll:");
		int roll=sc.nextInt();
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter marks:");
		double marks=sc.nextDouble();
		d.writeInt(roll);
		d.writeUTF(name);
		d.writeDouble(marks);
		d.close();
		System.out.println("Data is written in file");

	}

}
