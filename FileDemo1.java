import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileDemo1 {

			public static void main(String[] args) 
			{
			//Create a file programatically
			//create a folder
			//create a path
			String path="C:/FILEDEMO1";
			File f=new File(path);
			f.mkdir();
			//Create a html file in this folder
			String path1="C:/FILEDEMO1/Friend";
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
				String data="NAME:Ravali AGE:22 LOCATION:RJY";
				fw.write(data);
				fw.close();
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
			System.out.println("File created....Open file");

		}

	}



