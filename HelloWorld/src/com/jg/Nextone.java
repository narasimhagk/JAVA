package com.jg;

//import com.mysql.cj.xdevapi.Result;

import java.sql.*;

public class Nextone {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/employee";
        String username="root";
        String password="Gnk@1335555";

        Class.forName("com.mysql.cj.jdbc.Driver");

        //load the driver class
        try(Connection conn = DriverManager.getConnection(url,username,password);
            Statement stmt = conn.createStatement();
        ) {
            String sql = "CREATE TABLE CAP " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";

            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
