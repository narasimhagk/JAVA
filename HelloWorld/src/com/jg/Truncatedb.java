package com.jg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Truncatedb {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/lmao";
        String name="root";
        String code="Gnk@1335555";

        Connection con= DriverManager.getConnection(url,name,code);
        Statement state=con.createStatement();


        String truncatetab="TRUNCATE TABLE STUDENT_DETAILS";
        state.execute(truncatetab);
        System.out.println("Table turncate");
    }
}
