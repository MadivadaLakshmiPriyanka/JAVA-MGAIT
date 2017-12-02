import java.util.*;


public class ListDemo1 {

	public static void main(String[] args) {
		
		/*
		 * LIST DEMO using user i/p's
		 * 
		 */
		
				List <String> l=new ArrayList<String>();//If it is Linkedlist the reading is slow;If it is vector it is syncronized.
				Scanner sc=new Scanner(System.in);
				for(int i=0;i<10;i++)
				{
					System.out.println("Enter String");
					l.add(sc.next());
				}
				Collections.sort(l);//To sort in ascending order
				for(String s:l)
				{
					System.out.println(s);
				}
			}

		}


