package org.example;

import java.sql.*;

public class Main {

    static final String JBDC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";

    // Database credentials
    static final String USER = "sa";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            conn = DriverManager.getConnection("jdbc:h2:~/test", USER, PASS);
            System.out.println(conn.isValid(0));

            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();
            String sql = "CREATE TABLE REGISTRATION " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);

            System.out.println("Created table in given database...");

            stmt.executeUpdate("INSERT INTO REGISTRATION VALUES (100, 'Zara', 'Ali', 18)");
            stmt.executeUpdate("INSERT INTO REGISTRATION VALUES (101, 'Mahnaz', 'Fatma', 25)");
            stmt.executeUpdate("INSERT INTO REGISTRATION VALUES (102, 'Zaid', 'Khan', 30)");
            stmt.executeUpdate("INSERT INTO REGISTRATION VALUES(103, 'Sumit', 'Mittal', 28)");

            System.out.println("Inserted records into the table...");

            System.out.println("Connected database successfully...");
            ResultSet rs = stmt.executeQuery("SELECT id, first, last, age FROM REGISTRATION");

            // STEP 4: Extract data from result set
            while(rs.next()){
                // Retrieve by column name
                int id  = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");

                // Display values
                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
            }

            // STEP 5: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}