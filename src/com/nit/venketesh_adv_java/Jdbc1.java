package com.nit.venketesh_adv_java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Jdbc1 
{
	public static void main(String[] args)
	{

		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String usname = "C##GANESH";
		String pwd = "MANAGER";

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, usname, pwd);
			System.out.println("Connections is created !!");
			Statement stmt = con.createStatement(1004, 1007);
			ResultSet rs = stmt.executeQuery("select * from employee");

			while (rs.next()) {
				System.out.println(
						rs.getString(1) + " :" + rs.getString(1) + " :" + rs.getString(1) + " :" + rs.getInt(1));
			}
		} catch (Exception x) {
			x.printStackTrace();
		}

	}

}