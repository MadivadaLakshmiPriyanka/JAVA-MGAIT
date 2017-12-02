import java.util.StringTokenizer;

/*
 * String Tokenizer
 */
public class StringToken 
{

	public static void main(String[] args)
	{
		StringTokenizer st=new StringTokenizer("Hello Wor.ld Man.ipal",".");
		while(st.hasMoreTokens())
		{
			String str=st.nextToken();
			System.out.println(str);
		}

	}

}
