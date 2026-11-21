package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBC_Pro9 
{
	String driver ="oracle.jdbc.driver.OracleDriver";
    String DBURL="jdbc:oracle:thin:@localhost:1521:orcl";
	String USNAME="C##GANESH";
	String PWD= "MANAGER";
	public void m2 ()
	{
		System.out.println("Connecting to db ");
		try
		{
			Class.forName(driver);
			Connection con =DriverManager.getConnection(DBURL,USNAME,PWD);
			System.out.println("Connections creted !!");
			Statement st = con.createStatement(1004, 1008);
			ResultSet rs = st.executeQuery("select eid ,efname ,esal from employee");
			while (rs.next())
			{
				String em_id = rs.getString(1);
				if ("102".equals(em_id))
				{
					rs.updateInt("esal", 1000);
					rs.updateRow();
				}
			}
			System.out.println("Row Updated !!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	public static void main(String[] args) 
	{
		JDBC_Pro9 p1 = new JDBC_Pro9();
		p1.m2();

	}

}

