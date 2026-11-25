package com.nit.rsmt;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchDemo {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileReader fis=new FileReader("C:\\Users\\gana\\Downloads\\MOCK_DATA.csv");
			                             
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "C##GANESH", "MANAGER");
			PreparedStatement ps = con.prepareStatement("insert into student_info1 values(?,?,?,?)");
			Scanner sc=new Scanner(fis);
			
	        while(sc.hasNext())
	        {
	        	String[] split = sc.nextLine().split(",");
	        	for(int i=0;i<split.length;i++)
	        	{
	        	ps.setString(i+1, split[i]);	
	        	}
	        	ps.addBatch();
	        }
	        ps.executeBatch();
	        System.out.println("success");
	        
		}
	        catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}


