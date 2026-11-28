package com.nit.rsmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Jdbc_02 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			CallableStatement cs = con.prepareCall("{call storeStudentData(?,?,?,?,?,?,?,?,?)}");
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter Student id ");
		    int sId=Integer.parseInt(sc.nextLine());
		    System.out.println("Enter Stu RollNo");
		    int srollNo=Integer.parseInt(sc.nextLine());
		    System.out.println("Enter Student Name:");
		    String sName=sc.nextLine();
		    System.out.println("Enter Student Bransh:");
		    String branch=sc.nextLine();
		    System.out.println("Enter Student HouseNo:");
		    String hNo=sc.nextLine();
		    System.out.println("Enter Student City:");
		    String city=sc.nextLine();
		    System.out.println("Enter PinCode");
		    int pc=Integer.parseInt(sc.nextLine());
		    System.out.println("Enter Student MailId:");
		    String mId=sc.nextLine();
		    System.out.println("Enter Phno");
		    long phno=sc.nextLong();
		    cs.setInt(1, sId);
		    cs.setInt(2, srollNo);
		    cs.setString(3, sName);
		    cs.setString(4, branch);
		    cs.setString(5, hNo);
		    cs.setString(6, city);
		    cs.setInt(7, pc);
		    cs.setString(8, mId);
		    cs.setLong(9, phno);
		    cs.execute();
		    System.out.println("Success");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
