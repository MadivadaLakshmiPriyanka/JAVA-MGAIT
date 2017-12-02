package com.jdbcconnection;
import java.sql.*;
import java.util.*;
class ProductDemo
{
		private int id;
		private String name;
		private double price;
		private String catg;
		public ProductDemo()
		{
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.catg = catg;
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
		public double getPrice() 
		{
			return price;
		}
		public void setPrice(double price)
		{
			this.price = price;
		}
		public String getCatg() 
		{
			return catg;
		}
		public void setCatg(String catg) 
		{
			this.catg = catg;
		}
		
	}

	public class ProductsDemo2 {
		private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
		private static final String USER_ID="hr";
		private static final String PASSWORD="hr";
		public static void main(String[] args)
		{
			 Scanner sc=new Scanner(System.in);
			 try 
			 {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn=DriverManager.getConnection(URL, USER_ID, PASSWORD);
				System.out.println("How many records you want to enter");
				int a=sc.nextInt();
					for(int i=1;i<=a;i++)
					{
						PreparedStatement pstmt=conn.prepareStatement("INSERT INTO PRODUCTS VALUES(?,?,?,?)");
						ProductDemo p=new ProductDemo();
						System.out.println("Enter id");
						p.setId(sc.nextInt());
						System.out.println("Enter name");
						p.setName(sc.next());
						System.out.println("Enter price");
						p.setPrice(sc.nextDouble());
						System.out.println("Enter categorry");
						p.setCatg(sc.next());
						pstmt.setInt(1,p.getId());
						pstmt.setString(2,p.getName());
						pstmt.setDouble(3, p.getPrice());
						pstmt.setString(4, p.getCatg());
						pstmt.executeUpdate();
				
					}
				conn.commit();
				conn.close();
				System.out.println("Record update successfully......");
				
			} 
			 catch (Exception e)
			 {
				
				e.printStackTrace();
			}

		}

	}


