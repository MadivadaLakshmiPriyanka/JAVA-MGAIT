import java.util.*;
import java.lang.*;
class Friend1
{

		private int id;
		private String name;
		private int age;
		private Date since;
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
		public int getAge() 
		{
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Date getSince() {
			return since;
		}
		public void setSince(Date since) {
			this.since = since;
		}
		public static void addNewFriend()
		{
			System.out.println("Adding new friends");
		}
		public static void countNumberOfFriends()
		{
			System.out.println("Count number of friends");
		}
		public static void acceptFriendName()
		{
			System.out.println("Accepting friend name");
		}
		public static void searchForFriend()
		{
			System.out.println("Searching for friend");
		}
		public static void friendDetails()
		{
			System.out.println("Friend details");
		}

	

}
