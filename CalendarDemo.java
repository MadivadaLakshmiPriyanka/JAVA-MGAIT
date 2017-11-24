import java.util.*;
public class CalendarDemo {

	public static void main(String[] args) {
		Date d=new Date();
		//System.out.println(d);
		Calendar c=new GregorianCalendar();
		c.setTime(d);
		System.out.println(c.getTime());
		System.out.println(c.getTimeZone());
		System.out.println(c.getFirstDayOfWeek());
		
	}

}
