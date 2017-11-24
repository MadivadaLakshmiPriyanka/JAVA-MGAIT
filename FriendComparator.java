package com.myapplication;
import java.util.*;
public class FriendComparator implements Comparator
{
		public int compare(Object obj1,Object obj2)
		{
			Friend f1=(Friend)obj1;
			Friend f2=(Friend)obj2;
			
			return f1.getName().compareTo(f2.getName());
		}
}
