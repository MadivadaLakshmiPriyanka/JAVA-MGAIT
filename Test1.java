class A1
{
	int a=2;
	
}
class B1 extends A1
{
	int a=3;
}
public class Test1 {

	public static void main(String[] args) {
		A1 a=new B1();
		System.out.println(a.a);

	}

}
