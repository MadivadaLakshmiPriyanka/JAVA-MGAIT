import java.util.*;
public class Sentence {

	public static void main(String[] args) {
		int count=0,flag=0,i;
		System.out.println("Enter a Sentence");
		Scanner sc=new Scanner(System.in);
		String sen=sc.nextLine();
		
		String arr[]=sen.split(" ");
		for(i=0;i<arr.length;i++){
			count++;
		}
		System.out.println(count);
		
		System.out.println("Enter a word");
		String word=sc.next();
		for(i=0;i<arr.length;i++){
		if(word.equals(arr[i])){
			flag=1;
			break;
		}
		}
		if(flag==1){
			System.out.println(i);
		}
		else{
			System.out.println("element not fount");
		}
		/*if(sen.contains(word))
		{
			System.out.println("Word found at "+sen.indexOf(word) );
		}
		else
		{
			System.out.println("Word not found");
		}*/
		
	}

}
