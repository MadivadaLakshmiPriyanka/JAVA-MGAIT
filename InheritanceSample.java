import java.util.*;
/*
 * Dress Sample For Inheritance
 */
class Dress1 
{
	String material;
	String type;
	String colour;
	double size;
	void ironing()
	{
		System.out.println("Dress is ironed");
	}
	void showDress()
	{
		System.out.println(type+" "+material+" "+colour+" "+size);
	}
}
class MensWear extends Dress1
{
	void specialPurchase()
	{
		System.out.println("Purchase to specific to menswear");
	}
}
public class InheritanceSample
{

	public static void main(String[] args)
	{
		
		MensWear m=new MensWear();
		m.colour="Black";
		m.material="cotton";
		m.size=32;	
		m.type="casual";
		m.ironing();
		m.specialPurchase();
		m.showDress();
	}

}
