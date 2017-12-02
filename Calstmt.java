package com.jdbcconnection;

import java.sql.CallableStatement;
import java.sql.DriverManager;

public class Calstmt {

	public static void main(String[] args)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:system/password-1@localhost:1521:XE";
			String un="hr";
			String pwd="password-1";
			Connection con=DriverManager.getConnection(url,un,pwd);
			CallableStatement cs=conn.prepareCall("{call dept_ret(?,?)}");
		}

	}

}
