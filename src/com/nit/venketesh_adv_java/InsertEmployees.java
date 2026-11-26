package com.nit.venketesh_adv_java;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEmployees {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_db";
        String user = "root";
        String password = "root";

        String query = "INSERT INTO employee VALUES (?, ?, ?)";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 101);
            ps.setString(2, "Rohit");
            ps.setDouble(3, 35000);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Employee inserted successfully");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}