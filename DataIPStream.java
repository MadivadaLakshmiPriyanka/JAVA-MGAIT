import java.io.*;
import java.util.*;
////DataInputStream to read primitive data types from file
public class DataIPStream 
{

	public static void main(String[] args) throws Exception
	{
	String path="E:/StreamDemo/student.dat";
	FileInputStream f=new FileInputStream(path);
	DataInputStream d=new DataInputStream(f);
	
	while(d.available()>0)
	{
	int roll=d.readInt();
	String name=d.readUTF();
	double marks=d.readDouble();

	System.out.println(roll+" "+name+" "+marks);
	}

	}
	}


