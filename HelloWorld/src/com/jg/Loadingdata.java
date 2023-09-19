package com.jg;

import java.sql.*;

public class Loadingdata {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/employee";
        String un = "root";
        String pass = "Gnk@1335555";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection(url, un, pass);
        Statement st = c.createStatement();
        String sql = "INSERT INTO CAP VALUES (1, 'Zara', 'Ali', 18)";
        st.executeUpdate(sql);
        sql = "INSERT INTO CAP VALUES (2, 'Mahnaz', 'Fatma', 25)";
        st.executeUpdate(sql);
        sql = "INSERT INTO CAP VALUES (3, 'Zaid', 'Khan', 30)";
        st.executeUpdate(sql);
        sql = "INSERT INTO CAP VALUES(4, 'Sumit', 'Mittal', 28)";
        st.executeUpdate(sql);
        System.out.println("Inserted records into the table...");
        sql="SELECT * FROM cap";
        ResultSet r=st.executeQuery(sql);
        while(r.next()){
            System.out.println(r.getString(2));
        }
        r.close();
        st.close();
        c.close();
    }
}
