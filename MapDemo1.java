import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MapDemo1 {

	public static void main(String[] args) {
		Map <Integer,String>m=new HashMap<Integer,String>();
		m.put(101,"Priyanka");
		m.put(102, "ABC");
		m.put(103,"KLM");
		Set <Integer> s=m.keySet();
		for(Integer i:s)
		{
			System.out.println(i);
		}

	}

}
