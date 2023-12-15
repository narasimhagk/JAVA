package com.jg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Creatingtable {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/lmao";
        String root_name="root";
        String password="Gnk@1335555";

        Connection con= DriverManager.getConnection(url,root_name,password);
        Statement state=con.createStatement();
        String sql1="CREATE TABLE DETAILS" +
                "(ID INTEGER," +
                "NAME VARCHAR(47)," +
                "LOC VARCHAR(57))";
        state.executeUpdate(sql1);
        System.out.println("Table created.....");

        String sql11="INSERT INTO DETAILS VALUES (1,'SAITAMA','JAPAN')";
        state.executeUpdate(sql11);

        sql11="INSERT INTO DETAILS VALUES (2,'GENOS','JAPAN')";
        state.executeUpdate(sql11);

        System.out.println("Data inserted...");

        String loop="SELECT * FROM DETAILS";
        ResultSet rt= state.executeQuery(loop);
        while(rt.next()){
            System.out.println(rt.getInt(1)+" "+rt.getString(2)+" "+rt.getString(3));
        }







    }
}
