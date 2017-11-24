import java.util.*;
class Kid
{
	String frock;
	String salwar;
	void dressModel()
	{
		System.out.println("BabyGirls:"+frock);
		System.out.println("BabyBoys:"+salwar);
	}
	
}
class Category
{
	String designer;
	int price;
	void type()
	{
		System.out.println("Kids Dresses");
		Kid k=new Kid();
		k.frock="Readymade frocks";
		k.salwar="Occassional salwars";
		k.dressModel();
		System.out.println("Designed by:"+designer);
	}
}
public class Dress {

	public static void main(String[] args)
	{
		Category c=new Category();
		c.designer="KDesigners";
		c.type();

	}

}
