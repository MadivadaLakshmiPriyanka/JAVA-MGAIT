import java.io.*;
class Sivagami
{
	
}
class Ballaladeva extends Sivagami
{
	
}
class Bahubali extends Sivagami
{
	
	private int stoneballs;
	public int getstoneballs() 
	{
		return stoneballs;
	}
	public void setstoneballs(int stoneballs)
	{
		this.stoneballs = stoneballs;
	}

}
class Horse 
{
	
}
class Sword
{
	
}
class War
{
	int soldier[]=new int[5];

	void trishlavihuam()
	{
		
	}
	void attack()
	{
		System.out.println("Bahubali won the war");
	}
}

public class Mahismati {

	public static void main(String[] args)
	{
	
		War  w=new War();
		w.attack();
		Bahubali b=new Bahubali();
		b.setstoneballs(10);
		System.out.println("with 5 soldiers and "+b.getstoneballs()+" stoneballs");
	}

}
