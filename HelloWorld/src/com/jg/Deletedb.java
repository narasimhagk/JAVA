package com.jg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deletedb {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/lmao";
        String un="root";
        String ps="Gnk@1335555";

        Connection con = DriverManager.getConnection(url,un,ps);
        Statement sts=con.createStatement();
        String hu="DROP DATABASE LMAO";
        sts.executeUpdate(hu);
        System.out.println("Database Deleted....");
    }
}
