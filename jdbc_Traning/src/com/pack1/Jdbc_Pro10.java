package com.pack1;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Jdbc_Pro10 
{
  String driver ="oracle.jdbc.OracleDriver";
  String url="jdbc:oracle:thin:@localhost:1521:orcl";
  String uname ="C##GANESH";
  String pwd = "MANAGER";
  
  void m1()
  {
	  System.out.println("Implementing RowSet data !!");
	  try
	  {
		  RowSetFactory rsf = RowSetProvider.newFactory();
		  JdbcRowSet jrs = rsf.createJdbcRowSet();
		  
		  
		  jrs.setUrl(url);
		  jrs.setUsername(uname);
		  jrs.setPassword(pwd);
		  jrs.setCommand("select * from employee");
		  jrs.execute();
		  
		  
		  while (jrs.next())
		  {
			//  System.out.println(jrs.getString(1)+" "+jrs.getString(1)+" "+jrs.getString(1)+" "+jrs.getString(1)+" "+jrs.getString(1));
			  System.out.println(jrs.getInt(1)+" "+jrs.getString(2)+" "+jrs.getString(3)+" "+jrs.getInt(4)+" "+jrs.getString(5));
			   
		  }		
	  }
	  catch (Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  public static void main(String[] args) {
		Jdbc_Pro10  jd=new Jdbc_Pro10 ();
		jd.m1();
	}

}
