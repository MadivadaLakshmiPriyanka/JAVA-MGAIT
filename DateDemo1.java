import java.util.*;
import java.text.SimpleDateFormat;

public class DateDemo1 {

	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String date=sdf.format(new Date());
		System.out.println(date);

	}

}
