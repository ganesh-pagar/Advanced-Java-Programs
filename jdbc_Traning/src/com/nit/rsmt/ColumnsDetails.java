package com.nit.rsmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ColumnsDetails
{
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
	 Class.forName("oracle.jdbc.driver.DriverOracle");
	 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GANESH","MANAGER");
	 System.out.println("Connections created !!");
           
	}

}
