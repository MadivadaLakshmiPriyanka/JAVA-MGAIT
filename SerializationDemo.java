import java.io.*;

class Game implements Serializable
{
	private int id;
	private String name;
	private String rules;
	private int points;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getRules() 
	{
		return rules;
	}
	public void setRules(String rules) 
	{
		this.rules = rules;
	}
	public int getPoints()
	{
		return points;
	}
	public void setPoints(int points)
	{
		this.points = points;
	}
	
}
public class SerializationDemo
{

	public static void main(String[] args) throws Exception
	{
		Game g=new Game();
		g.setId(33433);
		g.setName("TOM DICK AND HARRY");
		g.setPoints(15);
		g.setRules("Guess the topic");
		String path="E:/StreamDemo/game";
		FileOutputStream fos=new FileOutputStream(path);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(g);
		System.out.println("Game Object is serialized");
		oos.close();
		
		

	}

}
