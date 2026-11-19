package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc_11 
{
	String driver ="oracle.jdbc.OracleDriver";
	  String url="jdbc:oracle:thin:@localhost:1521:orcl";
	  String uname ="C##GANESH";
	  String pwd = "MANAGER";
	  
	  public    void m1 ()
	  {
		  try
		  {
			  Class.forName(driver);
   		   Connection  con = DriverManager.getConnection(url,uname,pwd);
   		   System.out.println("Connections is created !!");
		  }
		  catch (Exception x)
		  {
			  x.printStackTrace();
		  }
	  }
	  public static void main(String[] args)
	  {
		
		 Jdbc_11   obj= new  Jdbc_11 ();
		 obj.m1();
	}

}
