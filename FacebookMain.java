package com.myapplication;
import java.util.*;


public class FacebookMain 
{
	static List<Friend> friends=new ArrayList<Friend>();
	public static void addFriend()
	{
		Friend f=new Friend();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id:");
		f.setId(sc.nextInt());
		System.out.println("Enter name:");
		f.setName(sc.next());
		System.out.println("Enter your age:");
		f.setAge(sc.nextInt());
		System.out.println("Enter date since friends:");
		f.setSince(sc.next());
		friends.add(f);
		System.out.println("New friends added");
	}
	public static void showFriends()
	{
		for(Friend f:friends)
		{
			System.out.println(f.getId()+" "+f.getName()+" "+f.getAge()+" "+f.getSince());
		}
	}
	public static void findFriend()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.next();
		boolean found=false;
		for(Friend f:friends)
		{
			if(f.getName().equals(name))
			{
				System.out.println("id="+f.getId());
				System.out.println("name="+f.getName());
				System.out.println("age="+f.getAge());
				System.out.println("Friend since"+f.getSince());
				found=true;
			}
		}
		if(found==false)
		{
			System.out.println("Name not found");
		}
	}
		public static void sortFriends()
		{
			Collections.sort(friends,new FriendComparator());
		}
	public static void main(String[] args) 
	{
		for(int i=0;i<3;i++)
	
		{
		addFriend();
		}
		//showFriends();
		//findFriend();
		sortFriends();
		showFriends();
		
	}

}
