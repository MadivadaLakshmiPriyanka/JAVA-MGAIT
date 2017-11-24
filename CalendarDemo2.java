import java.util.*;
import java.util.Calendar;

public class CalendarDemo2 {

	public static void main(String[] args) {
		Calendar calendar=new GregorianCalendar();
		calendar.set(Calendar.YEAR,2009);
		calendar.set(Calendar.MONTH,11);
		calendar.set(Calendar.DAY_OF_MONTH,31);	
		System.out.println(calendar.getTime());

	}

}
