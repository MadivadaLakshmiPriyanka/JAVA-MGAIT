class Employee
{
	static int num;
	static//initializing static members
	{
		num=20+20;
	}
}
public class StaticBlock {

	public static void main(String[] args) {
		System.out.println(Employee.num);

	}

}
