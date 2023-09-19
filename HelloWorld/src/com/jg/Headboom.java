package com.jg;

//import com.mysql.cj.xdevapi.Result;

import java.sql.*;

public class Headboom {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/employee";
        String username="root";
        String password="Gnk@1335555";

        //load the driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        //create the connection object
        Connection con= DriverManager.getConnection(url,username,password);

        //create the statement object
        Statement s=con.createStatement();

        //passing query as a string
        String query="SELECT ID,NAME FROM EMP";

        //Execute the query
        ResultSet rs=s.executeQuery(query);

        while (rs.next()){
            System.out.println(rs.getInt("id")+"  "+rs.getString("name"));
        }
    }
}
