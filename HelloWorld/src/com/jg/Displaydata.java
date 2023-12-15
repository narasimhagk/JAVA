package com.jg;

import java.sql.*;

public class Displaydata {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String pas = "Gnk@1335555";
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection(url, user, pas);
        Statement st = c.createStatement();

        String sql1 = "CREATE TABLE BOOK (ID INTEGER, NAME VARCHAR(47), AGE INTEGER)";
        st.executeUpdate(sql1);
        System.out.println("Table created....");

        String sql2 = "INSERT INTO BOOK VALUES (1, 'KRISHNA', 25)";
        st.executeUpdate(sql2);
        sql2 = "INSERT INTO BOOK VALUES (2, 'GIRIDAR', 24)";
        st.executeUpdate(sql2);
        sql2 = "INSERT INTO BOOK VALUES (3, 'GOVIND', 26)";
        st.executeUpdate(sql2);
        sql2 = "INSERT INTO BOOK VALUES (4, 'me', 23)";
        st.executeUpdate(sql2);
        System.out.println("Inserted data....");

        String sql3 = "SELECT * FROM BOOK";
        ResultSet rt = st.executeQuery(sql3);
        while (rt.next()) {
            System.out.println(rt.getInt(1) + " " + rt.getString(2) + " " + rt.getInt(3));
        }

        sql3 = "ALTER TABLE BOOK DROP AGE";
        st.executeUpdate(sql3);
        System.out.println("Table altered....");

        String sql4 = "SELECT * FROM BOOK";
        ResultSet updatedResultSet = st.executeQuery(sql4);
        while (updatedResultSet.next()) {
            System.out.println(updatedResultSet.getInt(1) + " " + updatedResultSet.getString(2));
        }

        sql3="DELETE FROM BOOK " +
                "WHERE ID=4";
        st.executeUpdate(sql3);
        System.out.println("Table row deleted..");

        String k="SELECT * FROM BOOK";
        ResultSet tt=st.executeQuery(k);
        while(tt.next()){
            System.out.println(tt.getInt(1) + " " + tt.getString(2));
        }

        sql3="DROP TABLE BOOK";
        st.executeUpdate(sql3);
        System.out.println("Table delete....");
        ResultSet tr=st.executeQuery(sql3);
        while (tr.next()){
            System.out.println(tr.getInt(1) + " " + tr.getString(2));

        }

    }
}
