/*
 * Constructor Chaining
 */
class Restaurant
{
	Restaurant()
	{
		System.out.println("Restaurant constructor is called");
	}
}
class CoffeeRestaurant extends Restaurant
{
	CoffeeRestaurant()
	{
		System.out.println("CoffeeRestaurant constructor is called");
	}
}
class CafeCoffeeDay extends CoffeeRestaurant
{
	CafeCoffeeDay()
	{
		System.out.println("cAFEcOFFEday constructor is called");
	}
}
class BaristaCoffee extends CafeCoffeeDay
{
	BaristaCoffee()
	{
		System.out.println("BaristaCoffee constructor is called");
	}
}
public class ConstructoChain {

	public static void main(String[] args) {
		
		BaristaCoffee coffee=new BaristaCoffee();
	}

}
