package com.nit.rsmt;


import java.sql.*;
import java.util.Scanner;

public class JdbcPro2 {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl"; // change as needed
    private static final String USER = "C##GANESH"; // your username
    private static final String PASS = "MANAGER";         // your password

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             Scanner sc = new Scanner(System.in)) {

            Class.forName("oracle.jdbc.OracleDriver"); // load driver
            System.out.println("Connected to DB ✅");

            while (true) {
                System.out.println("\nChoose Operation:");
                System.out.println("1. INSERT");
                System.out.println("2. UPDATE");
                System.out.println("3. DELETE");
                System.out.println("4. SELECT");
                System.out.println("5. EXIT");
                System.out.print("Enter choice: ");
                int ch = sc.nextInt();

                switch (ch) {
                    case 1 -> insert(con, sc);
                    case 2 -> update(con, sc);
                    case 3 -> delete(con, sc);
                    case 4 -> select(con);
                    case 5 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice ❌");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // INSERT
    private static void insert(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Name: ");
        String name = sc.next();

        String sql = "INSERT INTO student (id, name) VALUES (?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            int rows = ps.executeUpdate();
            System.out.println(rows + " record inserted ✅");
        }
    }

    // UPDATE
    private static void update(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        System.out.print("Enter new Name: ");
        String name = sc.next();

        String sql = "UPDATE student SET name=? WHERE id=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " record updated ✅");
        }
    }

    // DELETE
    private static void delete(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM student WHERE id=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " record deleted ✅");
        }
    }

    // SELECT
    private static void select(Connection con) throws SQLException {
        String sql = "SELECT * FROM student";
        try (Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\nID\tName");
            System.out.println("---------------");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" + rs.getString("name"));
            }
        }
    }
}
