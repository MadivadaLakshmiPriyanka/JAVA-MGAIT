package com.jdbcconnection;
import java.sql.*;
import java.util.*;
public class NetraDemo {
	private static final String DB_URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_ID="hr";
	private static final String PASSWORD="hr";

	public static void main(String[] args)
	{
		
	try
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn=DriverManager.getConnection(DB_URL,USER_ID,PASSWORD);
		CallableStatement cs=conn.prepareCall("{call del_reg(?)}");
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int x=scn.nextInt();
		cs.setInt(1,x);
		cs.executeUpdate();
		
		System.out.println("Record successfully deleted");
				
	}
	catch(Exception e)
	{
		System.out.println("HI");
	}

	}

}





