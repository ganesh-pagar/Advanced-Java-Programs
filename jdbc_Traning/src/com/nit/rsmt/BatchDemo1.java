package com.nit.rsmt;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchDemo1 {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\gana\\Downloads\\MOCK_DATA.csv";

		try (FileReader fr = new FileReader(filePath);
				Scanner sc = new Scanner(fr);
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "C##GANESH",
						"MANAGER");
				PreparedStatement ps = con.prepareStatement("INSERT INTO student_info1 VALUES (?,?,?,?,?,?)")) {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			sc.nextLine();

			while (sc.hasNextLine()) {
				String[] split = sc.nextLine().split(",");

               if (split.length != 4) {
                   System.out.println( String.join(",", split));
                   continue;
             }
			
				for (int i = 0; i < split.length; i++) {
					ps.setString(i + 1, split[i]);
				}

				ps.addBatch();
			}

			ps.executeBatch();
			System.out.println("success!!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
