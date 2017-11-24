import java.util.*;
/*
 * Book - Sample Program For Inheritance
 */
class  Book1
{
	String name;
	String author;
	int price;
	void read()
	{
		System.out.println("Reading");
	}
	void details()
	{
		System.out.println(name+" "+author+" "+price);
	}
}
class TextBook extends Book1
{
	void display()
	{
		System.out.println("This is a textbook");
	}
}
public class Book {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TextBook tb=new TextBook();
		tb.name="ABC";
		tb.author="XYZ";
		tb.price=100;
		tb.read();
		tb.details();
		tb.display();
	}

}
