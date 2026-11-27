package com.nit.rsmt;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Programs02 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",	"C##GANESH", "MANAGER");
		con.setAutoCommit(false);
	
		String updateQueryForName="update Employee set name=? where id=?";
		PreparedStatement pstmt=con.prepareStatement(updateQueryForName);
		System.out.println("Enter the name to be update");
		String name=sc.next();
		System.out.println("Enter the id for which you want to update");
		int id=sc.nextInt();
		
		pstmt.setString(1, name);
		pstmt.setInt(2, id);
		
		// update  for eaddress
		String updateQueryForAdress="update Employee set eaddress=? where Eid=?";
		PreparedStatement pstmt1=con.prepareStatement(updateQueryForAdress);
		System.out.println("Enter the eaddress to be update");
		String eaddress=sc.next();
		System.out.println("Enter the employee id for which you want to update");
		int eid1=sc.nextInt();
		
		pstmt1.setString(1,eaddress );
		pstmt1.setInt(2, eid1);
		
		  int executeUpdate1 = pstmt.executeUpdate();
		  int executeUpdate2 = pstmt1.executeUpdate();
		  
		    if(executeUpdate1>=1 && executeUpdate2>=1) {
		     	con.commit();
		    	 System.out.println("Operations compeleted!!");
		    }
		    else {
		    	   con.rollback();
		    	 System.out.println("Not compeleted!!");
		    }
		
		
	}
	catch (ClassNotFoundException e) 
	{		
		e.printStackTrace();		
	} 
	catch (SQLException e)
	{
		
		e.printStackTrace();
	}
	
}
}