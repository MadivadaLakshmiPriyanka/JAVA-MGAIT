package com.jdbcconnection;

import java.util.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * Finding VALUES
 */
public class ProductsDemo1
{
	private static final String DB_URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_ID="hr";
	private static final String PASSWORD="hr";
	public static void main(String[] args)
	{
		
		Scanner scn=new Scanner(System.in);
		
		try
		{
		
		//Register Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Establish connection with DBMS
		Connection conn=DriverManager.getConnection(DB_URL,USER_ID,PASSWORD);
		Statement statement=conn.createStatement();
		
		PreparedStatement ps=conn.prepareStatement("Select PROD_NAME,PROD_PRICE,PROD_CATG from PRODUCTS where PROD_CODE=?");
		System.out.println("Enter code");
		int code=scn.nextInt();
		ps.setInt(1,code);
		
		//ps.executeUpdate();
		//conn.commit();
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
		String name=rs.getString("PROD_NAME");
		System.out.println("name:"+name);
		String price=rs.getString("PROD_PRICE");
		System.out.println("price:"+price);
		String catg=rs.getString("PROD_CATG");
		System.out.println("catag:"+catg);
		}
		conn.close();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		scn.close();
		

	}

}

