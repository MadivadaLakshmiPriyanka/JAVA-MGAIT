import java.io.*;

public class FileDemo {

	public static void main(String[] args) {
		//Create a file programatically
		//create a folder
		//create a path
		String path="C:/FILEDEMO";
		File f=new File(path);
		f.mkdir();
		//Create a html file in this folder
		String path1="C:/FILEDEMO/Manipal.html";
		File f2=new File(path1);
		try
		{
		f2.createNewFile();
		}
		catch(IOException e)
		{
	
			System.out.println(e);
		}
		try
		{
			FileWriter fw=new FileWriter(f2);
			String html="<html><body bgcolor=pink><h1><marquee>HI HELLO HOW ARE YOU</marquee></h1></body></html>";
			fw.write(html);
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		System.out.println("File created....Open browser");

	}

}
