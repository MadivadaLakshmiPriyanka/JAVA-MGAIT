import java.util.*;
public class Facebook 
{

	public static void main(String[] args) 
	{
		LogIn li=new LogIn();
		li.details();
		Friend1 f=new Friend1();
		f.setId(1);
		f.setName("Priyanka");
		f.setAge(22);
		f.setSince(null);
		System.out.println(f.getId());
		System.out.println(f.getName());
		System.out.println(f.getAge());
		System.out.println(f.getSince());
		f.addNewFriend();
		f.countNumberOfFriends();
		f.acceptFriendName();
		f.searchForFriend();
		f.friendDetails();
		Post p=new Post();
		p.like(1);
		p.sortMessage();

	}

}
