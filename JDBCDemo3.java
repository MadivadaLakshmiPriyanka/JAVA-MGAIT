package com.jdbcconnection;
import java.util.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * DELETING VALUES
 */
public class JDBCDemo3
{
	private static final String DB_URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_ID="hr";
	private static final String PASSWORD="hr";
	public static void main(String[] args)
	{
		int dno;
		String nme,lc;
		Scanner scn=new Scanner(System.in);
		
		try
		{
		
		//Register Driver
		Class.forName("oracle.jdbc.OracleDriver");
		//Establish connection with DBMS
		Connection conn=DriverManager.getConnection(DB_URL,USER_ID,PASSWORD);

		PreparedStatement ps=conn.prepareStatement("delete from regions");
		System.out.println("Enter id");
		dno=scn.nextInt();
		System.out.println("Enter Name");
		nme=scn.next();
		ps.setInt(1,dno);
		ps.setString(2,nme);
		ps.executeUpdate();
		conn.commit();
		conn.close();
		System.out.println("Record Successfuly Deleted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		scn.close();
		

	}

}
