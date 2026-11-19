package com.pack1;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

class  Test1
{
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String uname ="C##GANESH";
	String pwd="MANAGER";
	String sqlQuery="select * from employee";
	public void m1 ()
	{
		System.out.println("Connecting to the DataBase !");
		try
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,uname,pwd);
			System.out.println("Connection Created Successfully!!");
			
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
	}
}
public class JdbcPro2
{
	public static void main(String[] args) 
	{
		Test1 t1 = new Test1 ();
		t1.m1();
	}
}
