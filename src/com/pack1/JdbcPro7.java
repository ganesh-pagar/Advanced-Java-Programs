package com.pack1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcPro7
{
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver is a loaded ..");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GANESH","MANAGER");
		System.out.println("Connection Is A Created !!");
		
		Statement stmt = con.createStatement();
		System.out.println("Statements is a created !");
		
	
		String tableCreationQuery =
			    "CREATE TABLE zomato (\n" +
			    "    zomato_id NUMBER(4) PRIMARY KEY,\n" +
			    "    zomato_app_names VARCHAR2(50) UNIQUE NOT NULL,\n" +
			    "    zomato_charg NUMBER(7,2)\n" +
			    ")";
		/*String custmers=
				"""  CREATE TABLE cust (
                 cid number (4) primary key ,
                 cname VARCHAR2(20) NOT NULL ,
                 CUS_ID NUMBER (4) REFERENCES zomato(zomato_id),
                 )""";*/
		String customers = """
			    CREATE TABLE cust (
			        cid NUMBER(4) PRIMARY KEY,
			        cname VARCHAR2(20) NOT NULL,
			        CUS_ID NUMBER(4) REFERENCES zomato(zomato_id)
			    )
			    """;

		

	}
}