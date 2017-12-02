package com.jdbcconnection;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
/*
 * SELECTING DATA
 */
public class JDBCDemo5
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
			ResultSet rs=statement.executeQuery("Select * from regions");
			ResultSetMetaData rsmd=rs.getMetaData();
			int n=rsmd.getColumnCount();
			for(int i=1;i<=n;i++)
			{
				System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));
				System.out.println();
			}
			
		}
		catch(SQLException e)
		{
			System.out.println("HI");
		}
		

	}

}

