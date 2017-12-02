
public class Sentence1 {

	public static void main(String[] args) {
		String str="Hello hi how r u";
		String search="hi";
		if(str.contains(search))
		{
			System.out.println("Word found at "+str.indexOf(search) );
		}
		else
		{
			System.out.println("Word not found");
		}

	}

}
