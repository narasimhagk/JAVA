package com.jg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteRecords {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/lmao";
        String un="root";
        String pw="Gnk@1335555";

        Connection cn= DriverManager.getConnection(url,un,pw);
        Statement st=cn.createStatement();
//        String q="DELETE FROM STUDENT_DETAILS WHERE ID BETWEEN 3 AND 5";
//        st.executeUpdate(q);
//        System.out.println("Deleted Sucessfully");
//
//        String q1="SELECT * FROM STUDENT_DETAILS ";
//        ResultSet rs=st.executeQuery(q1);
//        while (rs.next())
//        {
//            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//        }

        String r="DELETE FROM STUDENT_DETAILS WHERE Id=4 AND ID=5";

        st.executeUpdate(r);

        String r1="SELECT * FROM STUDENT_DETAILS ";

        ResultSet ty=st.executeQuery(r1);
        while (ty.next())
        {
            System.out.println(ty.getInt(1)+" "+ty.getString(2)+" "+ty.getInt(3));
        }


        ty.close();
        st.close();
        cn.close();

    }
}