
abstract class Alien
{
	private String name;
	private String shape;
	private String food;
	Alien()
	{
		
	}
	Alien(String name,String shape,String food)
	{
		this.name=name;
		this.shape=shape;
		this.food=food;
	}
	public void showAlien()
	{
		System.out.println("name:"+name+"shape:"+shape+"food:"+food);
	}
}
class KoiMilGayaAlien extends Alien
{
	double power;
	KoiMilGayaAlien(String name,String shape,String food,double power)
	{
		super(name,shape,food);
		this.power=power;
	}
	KoiMilGayaAlien()
	{
		
	}
	public void exchangePower()
	{
		System.out.println("Alien exchanging power with strength="+power);
	}
}
public class ConstructorDemo1 {

	public static void main(String[] args) {
		KoiMilGayaAlien alien=new KoiMilGayaAlien("Jaadu","Short","Dhoop",900.00);
		alien.showAlien();
		alien.exchangePower();

	}

}
