package com.pack1;
import java.sql.Connection;
import java.sql.DriverManager;
public class JdbcPro1{
    String driver="oracle.jdbc.driver.OracleDriver";
    String DBURL="jdbc:oracle:thin:@localhost:1521:ORCL";
    String USNAME="C##GANESh";
    String PWD="MANAGER";
    public void method1() {
        System.out.println("Connecting to the database");
        try{       
             Class.forName(driver);
            Connection con = DriverManager.getConnection(DBURL, USNAME, PWD);
            System.out.println("Connection Created Successfully");
            con.close();
            System.out.println("Connection Closed");     }
        catch(Exception e) {
            e.printStackTrace();}}
    public static void main(String[] args) {
            JdbcPro1 obj = new JdbcPro1();
        obj.method1();}}