class Myclass implements Runnable{
	public void run(){
		System.out.println("myclass run is called");
	}
}
public class ThreadDemo1 {
public static void main(String[] args) {
	Myclass m=new Myclass();
	Thread t=new Thread(m);
	t.start();
	System.out.println("main thread");
}
}