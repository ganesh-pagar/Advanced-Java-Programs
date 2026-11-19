
package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcSelectExample {
    public static void main(String[] args) {

        try {
            // 1. Load Driver (optional in newer versions)
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/ORCL",
                    "C##GANESH",      // username
                    "MANAGER"     // password (change this)
            );

            System.out.println("Connected to DB ✅");

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM emp");

            // 5. Process Result
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                double salary = rs.getDouble(3);

                System.out.println(id + "  " + name + "  " + salary);
            }

            // 6. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}