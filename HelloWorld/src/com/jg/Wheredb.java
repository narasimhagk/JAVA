package com.jg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Wheredb {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/lmao";
        String root="root";
        String code="Gnk@1335555";

        Connection con= DriverManager.getConnection(url,root,code);
        Statement st=con.createStatement();

        String sql="SELECT ID, NAME, LOC FROM STUDENT_DETAILS" +
                "WHERE ID>=2";
        ResultSet rt=st.executeQuery(sql);
        while (rt.next()){
            System.out.println(rt.getInt(1)+" "+rt.getString(2)+" "+rt.getInt(3)+" "+rt.getInt(4));
        }

    }
}
