package com.jdbcconnection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * SELECTING DATA
 */
public class JDBCDemo1 
{
	private static final String DB_URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_ID="hr";
	private static final String PASSWORD="hr";
	
	public static void main(String[] args)
	{
		final String sql="SELECT COUNTRY_ID,COUNTRY_NAME from COUNTRIES";
		String sql1="INSERT INTO REGIONS VALUES(6,'AUSTR')";
		
		Connection conn=null;
		try
		{
			//Register Driver
			Class.forName("oracle.jdbc.OracleDriver");
			//Establish connection with DBMS
			conn=DriverManager.getConnection(DB_URL,USER_ID,PASSWORD);
			//Create Statement
			Statement statement=conn.createStatement();
			//Execute Query
			//ResultSet result=statement.executeQuery(sql);
			int insertCount=statement.executeUpdate(sql1);
			/*while(result.next())
			{
				String id=result.getString("COUNTRY_ID");
				String name=result.getString("COUNTRY_NAME");
				System.out.println(id+" "+name);
				
			}*/
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}

	}

}
