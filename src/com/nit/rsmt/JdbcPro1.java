package com.nit.rsmt;
import java.sql.*;

public class JdbcPro1 {
    public static void main(String[] args) {
        try {
            // Step 1: Load Driver
            Class.forName("oracle.jdbc.OracleDriver");

            // Step 2: Establish Connection
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:orcl", "C##GANESH", "MANAGER");

            // Step 3: Create Statement
            Statement stmt = con.createStatement();

            // Step 4: Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            // Step 5: Process Results
            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

            // Step 6: Close
            rs.close();
            stmt.close();
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
