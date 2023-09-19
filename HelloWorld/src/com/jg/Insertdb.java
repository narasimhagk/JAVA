package com.jg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insertdb {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/lmao";
        String id="root";
        String pas="Gnk@1335555";
        
        Connection con= DriverManager.getConnection(url,id,pas);
        Statement st=con.createStatement();
        
        String sql="INSERT INTO STUDENT_DETAILS VALUES(1,'LUFFY',10,'JAPAN')";
        st.executeUpdate(sql);
        sql="INSERT INTO STUDENT_DETAILS VALUES(2,'ZORO',10,'JAPAN')";
        st.executeUpdate(sql);
        sql="INSERT INTO STUDENT_DETAILS VALUES(3,'SANJI',10,'JAPAN')";
        st.executeUpdate(sql);

        String sql2="SELECT * FROM STUDENT_DETAILS";
        ResultSet rt=st.executeQuery(sql2);

        while (rt.next()){
            System.out.println(rt.getInt(1)+" "+rt.getString(2)+" "+rt.getInt(3)+" "+rt.getString(4));
        }
        System.out.println("Data Inserted into Table.....");
        rt.close();
        st.close();
        con.close();
    }
}
