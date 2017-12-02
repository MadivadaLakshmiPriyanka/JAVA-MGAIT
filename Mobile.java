import java.util.*;
class Property {

	// TODO Auto-generated method stub
	/*
	 * Object Properties & behaviour
	 */
String design;//shape of mobile
String brand;
double price;
void makeCall()
{
	System.out.println("Making Call...");
}
void sendMessage()
{
	System.out.println("Sending sms...");
}
	void showDetails()
	{
		System.out.println("Design="+design);
		System.out.println("Brand="+brand);
		System.out.println("Price="+price);
	}
}
public class Mobile
{
	public static void main(String[] args) 
	{
	Property p=new Property();
	p.brand="Samsung";
	p.design="Rectangle";
	p.price=7000.00;
	p.makeCall();
	p.sendMessage();
	p.showDetails();
	
	}
}
