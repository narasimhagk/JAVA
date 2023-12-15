package com.jg;

import java.sql.*;

public class Dropdatabase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost/";
        String un="root";
        String pas="Gnk@1335555";
        Class.forName("com.mysql.jdbc.Driver");
        Connection c= DriverManager.getConnection(url,un,pas);
        Statement st=c.createStatement();
        String database="CREATE DATABASE LMAO";
        st.executeUpdate(database);
        System.out.println("Database created......");
        String u="USE LMAO";
        st.executeUpdate(u);
        System.out.println("using db.....");
        String i="CREATE TABLE STUDENT_DETAILS" +
                "(ID INTEGER not NULL," +
                "NAME VARCHAR(57)," +
                "CLASS INTEGER," +
                "ADDRESS VARCHAR(57))";
        st.executeUpdate(i);
        System.out.println("Table created..");
        String sql="INSERT INTO STUDENT_DETAILS VALUES(1,'LUFFY',10,'JAPAN')";
        st.executeUpdate(sql);
        sql="INSERT INTO STUDENT_DETAILS VALUES(2,'ZORO',10,'JAPAN')";
        st.executeUpdate(sql);
        sql="INSERT INTO STUDENT_DETAILS VALUES(3,'SANJI',10,'JAPAN')";
        st.executeUpdate(sql);
        sql="INSERT INTO STUDENT_DETAILS VALUES(4,'USOPP',10,'JAPAN')";
        st.executeUpdate(sql);
        String d="SELECT * FROM STUDENT_DETAILS";
        ResultSet t=st.executeQuery(d);
        while (t.next()){
            System.out.println(t.getInt(1)+" "+t.getString(2)+" "+t.getInt(3)+" "+t.getString(4));
        }
//        String hu="DROP DATABASE LMAO";
//        st.executeUpdate(hu);
//        System.out.println("Database Deleted....");
    }
}
