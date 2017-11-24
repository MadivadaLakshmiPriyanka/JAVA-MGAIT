import java.util.*;
import java.util.Calendar;

public class CalendarDemo1 {

	public static void main(String[] args) {
		Calendar c=new GregorianCalendar();//Calendar object created
		c.setTime(new Date());//
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//Todays day of month 
		System.out.println(c.get(Calendar.DAY_OF_YEAR));//Todays day of year

	}

}
