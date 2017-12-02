package com.jdbcconnection;
import java.sql.*;
import java.util.*;
public class ProductsDemo3 
{
		private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
		private static final String USER_ID="hr";
		private static final String PASSWORD="hr";
		public static void main(String[] args) 
		{
			try 
			{
				String sql=null;
				 Scanner sc=new Scanner(System.in);
				 System.out.println("enter 1 to update electronics enter 0 to update clothing"); 
				 int i=sc.nextInt();
				if(i==1)
				{
					 sql="UPDATE PRODUCTS SET PROD_PRICE =(PROD_PRICE +0.1) WHERE (PROD_CATG='ELECTRONICS' AND PROD_PRICE<1000)";
				}
				if(i==0)
				{
					 sql="UPDATE PRODUCTS SET PROD_PRICE =(PROD_PRICE -0.1) WHERE (PROD_CATG='CLOTHING' AND PROD_PRICE>1000)";
				}
				
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn=DriverManager.getConnection(URL, USER_ID, PASSWORD);
				Statement statement=conn.createStatement();
				ResultSet result=statement.executeQuery(sql);
				System.out.println("Updation is successfull");
				conn.close();
		 } 
		catch (Exception e)
		{
				
		 e.printStackTrace();
		}
			

		}

	}

