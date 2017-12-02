import java.util.*;
/*
 * Method Overriding
 */
class Shape
{
	void draw()
	{
		System.out.println("Draw any shape");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Draw a triangle");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Draw a rectangle");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Draw a circle");
	}
}
public class PolymorphismSample {

	public static void main(String[] args)
	{
		Shape s;
		s=new Triangle();
		s.draw();
		s=new Rectangle();
		s.draw();
		s=new Circle();
		s.draw();
		s=new Shape();
		s.draw();
	}

}
