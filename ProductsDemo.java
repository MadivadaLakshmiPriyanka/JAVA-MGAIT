package com.jdbcconnection;
import java.io.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
/*
 * SELECTING DATA
 */
public class ProductsDemo 
{
	private static final String DB_URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_ID="hr";
	private static final String PASSWORD="hr";
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		try
		{
			//Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Establish connection with DBMS
			Connection conn=DriverManager.getConnection(DB_URL,USER_ID,PASSWORD);
			//Create Statement
			Statement statement=conn.createStatement();
			//Execute Query
			ResultSet rs=statement.executeQuery("SELECT * from PRODUCTS");
			
			while(rs.next())
			{
			String code=rs.getString("PROD_CODE");
			String name=rs.getString("PROD_NAME");
			String price=rs.getString("PROD_PRICE");
			String catg=rs.getString("PROD_CATG");
			System.out.println(code+" "+name+" "+price+" "+catg);
			}
			
					
			
		}
		catch(SQLException e)
		{
			System.out.println("HI");
		}
		
	}

}



	