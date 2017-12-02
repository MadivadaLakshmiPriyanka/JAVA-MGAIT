
import java.util.concurrent.SynchronousQueue;
interface MusicInstrument
{
	public void play();
	
}
interface Flute extends MusicInstrument
{
	public void sound();
}

class Music implements MusicInstrument,Flute
{

	public void play() 
	{
		System.out.println("Playing");
		
	}

	public void sound()
	{
		System.out.println("Flute");
	}
	
	
}
public class InterfaceDemo2 extends Music {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicInstrument mi=new Music();
		mi.play();
		Flute f=new Music();
		f.sound();
		
	}

}
