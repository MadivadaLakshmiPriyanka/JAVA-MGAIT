import java.util.Locale;
public class LocaleDemo {

	public static void main(String[] args) {
		Locale l=new Locale("en","US");
		System.out.println(l.getCountry());
		System.out.println(l.getDisplayCountry());
		System.out.println(l.getDisplayLanguage());
		System.out.println(l.getDisplayName());
		System.out.println(l.getISO3Country());
		

	}

}
