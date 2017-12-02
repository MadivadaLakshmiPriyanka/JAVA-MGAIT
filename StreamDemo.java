import java.io.*;
import java.util.*;
public class StreamDemo {

	public static void main(String[] args) throws Exception
	{
		String source="E:/StreamDemo/source.txt";
		String destination="E:/StreamDemo/destination.txt";
		FileInputStream fis=new FileInputStream(source);
		FileOutputStream fos=new FileOutputStream(destination,true);
		int ch;
		while((ch=fis.read())!=-1)
		{
			fos.write((char)ch);
		}
		fis.close();
		fos.close();
		System.out.println("File written to file");
	}

}
