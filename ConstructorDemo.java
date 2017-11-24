import java.util.*;
/* Constructor is a method
 * with the same name as class name
 * It is automatically called when the object is 
 * created
 * 
 * It is used to initialize an object with default
 * values
 */

class Furniture
{
	String name;
	String shape;
	double price;
	
	Furniture()
	{
		   name="Sofa";
		   shape="Standard";
		   price=50000.00;
		
	}
	
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Furniture f=new Furniture();
		
		System.out.println(f.name);
		System.out.println(f.shape);
		System.out.println(f.price);
	}

}
