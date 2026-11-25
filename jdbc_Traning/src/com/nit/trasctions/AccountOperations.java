package com.nit.trasctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class AccountOperations 
{
	public   boolean addAccountDetails(Accounts account)
		
	{
		
		return false;
		
	}
		
	

		
	
	
	public  void viewAccountDetails()
	{
		
	}

	public  void transactionOperation(Accounts account)
	{
Scanner scn =  new Scanner (System.in);
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "C##GANESH", "orcl");
			PreparedStatement ps = con.prepareStatement("insert into accounts values(?,?,?)");
			System.out.println("data inserted !!");
			
			String  updateBalance= "update accounts set balance =? where acc_no=?";
			con.prepareStatement(updateBalance);
			String withdrawamounts ="update accounts set with =? where acc_no=?";
			con.prepareStatement(withdrawamounts);
			
			
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
