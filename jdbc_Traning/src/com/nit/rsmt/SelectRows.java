package com.nit.rsmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRows 
{

	public static void main(String[] args) throws ClassNotFoundException ,SQLException
	{
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GANESH","MANAGER");
       Statement stmt = con.createStatement();
       ResultSet rs = stmt.executeQuery("select * from course");
       while(rs.next())
       {
    	   System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getDouble(3));
    	   
       }
       System.out.println("------------------------------");
       rs.close();
       stmt.close();
       con.close();
	}     
	
	

	
}