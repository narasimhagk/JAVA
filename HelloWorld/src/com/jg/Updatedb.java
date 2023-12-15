package com.jg;

import java.sql.*;

public class Updatedb {
    public static void main(String[] args) throws SQLException {
        String player_details="jdbc:mysql://localhost:3306/lmao";
        String player_name="root";
        String player_password="Gnk@1335555";

        Connection con= DriverManager.getConnection(player_details,player_name,player_password);

        Statement st=con.createStatement();

        String sql="INSERT INTO STUDENT_DETAILS VALUES(5,'NAMI',10,'JAPAN')";
        st.executeUpdate(sql);

//        String update_sql="UPDATE STUDENT_DETAILS SET CLASS=9 WHERE ID IN (4,5)";
//        st.executeUpdate(update_sql);

        String query="SELECT * FROM STUDENT_DETAILS";
//        st.executeQuery(query);

        ResultSet rs=st.executeQuery(query);

        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
        }

        // Inserting Values:
////        String sql1="INSERT INTO STUDENT_DETAILS VALUES (3,'SANJI',10,'JAPAN')";
////        st.executeUpdate(sql1);
////        sql1="INSERT INTO STUDENT_DETAILS VALUES (4,'USOPP',10,'JAPAN')";
////        st.executeUpdate(sql1);
//        System.out.println("Inserted the data");
//        String sql2="SELECT * FROM STUDENT_DETAILS";
//        ResultSet rty=st.executeQuery(sql2);
//
//        while(rty.next()){
//            System.out.println(rty.getInt(1)+" "+rty.getString(2)+" "+rty.getInt(3)+" "+rty.getString(4));
//        }

        System.out.println("Updating Table");
        // Updating the query
        String update_sql="UPDATE STUDENT_DETAILS SET CLASS=9 WHERE ID IN (4,5)";
        st.executeUpdate(update_sql);
        String query1="SELECT * FROM STUDENT_DETAILS";

        ResultSet rt=st.executeQuery(query1);
        while(rt.next()){
            System.out.println(rt.getInt(1)+" "+rt.getString(2)+" "+rt.getInt(3)+" "+rt.getString(4));
        }


    }
}
