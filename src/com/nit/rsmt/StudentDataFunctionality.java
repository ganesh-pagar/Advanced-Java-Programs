package com.nit.rsmt;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDataFunctionality {

    public static boolean insertData(Student s) {
        boolean flag = false;
        try {
            Connection con = ConnectionProvider.getConn();
            String q = "INSERT INTO student101 (name, id, address, adharno) VALUES (?, ?, ?, ?)";
            PreparedStatement psmt = con.prepareStatement(q);

            psmt.setString(1, s.getName());
            psmt.setInt(2, s.getId());
            psmt.setString(3, s.getAddress());
            psmt.setString(4, s.getAdharno());

            int rows = psmt.executeUpdate();  // Execute insert
            if (rows > 0) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 	 	
        return flag;
    }
}
