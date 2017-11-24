package com.myapplication;

import java.util.*;

public class Friend
{
	private int id;
	private String name;
	private int age;
	private String since;
	Friend()
	{
		
	}
	public Friend(int id, String name, int age, String since) 
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.since = since;
	}
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
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getSince()
	{
		return since;
	}
	public void setSince(String since)
	{
		this.since = since;
	}
	

}
