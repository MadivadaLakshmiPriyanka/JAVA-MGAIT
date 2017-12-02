class A
{
	int a;
	/*A()
	{
		int a;
		a=4;
		a++;
		
	}*/
	A(int a)
	{
		a=3;
	}
}
public class Test {

	public static void main(String[] args) {
		/*A a=new A();
		a.a=a.a+1;
		System.out.println(a.a);*/
		int a=4;
		A b=new A(a);
		System.out.println(a);

	}

}
