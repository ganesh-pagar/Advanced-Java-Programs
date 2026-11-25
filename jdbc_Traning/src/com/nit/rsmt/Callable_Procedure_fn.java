package com.nit.rsmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;
public class Callable_Procedure_fn
{
public static void main(String[] args) throws ClassNotFoundException,SQLException
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GANESH","MANAGER");
	System.out.println("Connections Created ?");
	CallableStatement csmt = con.prepareCall("{");
}
}
