
		class Employe
		{
		String name = "Charles";
		String getNameData() { return name; }
		}
		class Manager extends Employe
		{
		String name = "John";
		String getNameData() { return name; }
		}
		public class Sample3 
		{
		public static void main(String[] args)
		{ 
		Employe emp = new Manager();
		System.out.println(emp.name+" "+emp.getNameData());
		}
		}







	