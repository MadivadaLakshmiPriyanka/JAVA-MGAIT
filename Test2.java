
public class Test2 {
	int a=5;
	static int b=6;


	public static void main(String[] args) 
	{

		Test2 x=new Test2();
		Test2 y=new Test2();
	x.a=3;
	y.a=6;
	x.b=10;
	y.b=20;
	System.out.println(x.a+y.a+x.b+y.b);
	System.out.println(x.a);
	System.out.println(y.a);
	System.out.println(x.b);
	
	System.out.println(y.b);

}
}
