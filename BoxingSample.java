
public class BoxingSample {

	public static void main(String[] args) {
		Integer a=new Integer(33);//old implementation
		Integer b=89;//Autoboxing
		int c=a;//Auto Unboxing
		System.out.println(c);
		Integer k=c;
		int p=k;
		System.out.println(p);
	}

}
