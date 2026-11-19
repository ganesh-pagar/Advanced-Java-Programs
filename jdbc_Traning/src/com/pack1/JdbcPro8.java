package com.pack1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class JdbcPro8 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1. Loading DB driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver is loaded");
		
		//2. Establishing connection
		Connection con = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:ORCL",
						"C##GANESH", "MANAGER");
		System.out.println("Connection is created");
		
		//3. Creating Statement object
		Statement stmt = con.createStatement();
		System.out.println("Statement is created");
		
		//4. Executing Table creation queries
		String courseTableQuery = 	
				"CREATE TABLE course5(\n" 					+
				"	course_id	NUMBER(4)	PRIMARY KEY,\n"		+
				"	course_name	VARCHAR2(50)	UNIQUE NOT NULL,\n"	+
				"	course_fee	Number(7,2)\n"				+	
				")";

		
		String studentTableQuery =
		        """
		        CREATE TABLE student5(
		           sid        NUMBER(4)   PRIMARY KEY,
		           sname      VARCHAR2(20) NOT NULL,
		           course_id  NUMBER(4)    REFERENCES course5(course_id),
		           fee        NUMBER(7,2)
		        )
		        """;

		
		stmt.execute(courseTableQuery);
		System.out.println("Course5 table is created");
		
		stmt.execute(studentTableQuery);
		System.out.println("Student5 table is created");
		
		//5.closing connection
		stmt.close();
		con.close();
		
	}
}