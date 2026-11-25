package com.nit.rsmt;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    private static Connection con;

    public static Connection getConn() {
        try {
            if (con == null) {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection(
                        "jdbc:oracle:thin:@localhost:1521:orcl", 
                        "C##GANESH", 
                        "MANAGER"     
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
