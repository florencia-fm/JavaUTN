package org.example;

import java.sql.*;

/*

// v1
public class Main {

    static final String JBDC_DRIVER = "org.h2.Driver"; // Usaríamos esto si nuestra DB fuera embebida o servidor
    static final String DB_URL = "jdbc:h2:mem:"; // Trabajaríamos con una DB en memoria por motivos de tiempos y simplicidad

    // Database credentials
    static final String USER = "sa"; // Valores por defecto de login (si usaramos un servidor sería necesario)
    static final String PASS = ""; // valor por defecto de login (si usaramos un servidor sería necesario)

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            conn = DriverManager.getConnection(DB_URL); // Realizamos la conexión a la DB
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

                // STEP 5: Clean-up environment
                rs.close();
                stmt.close();
                conn.close();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
} */

// v2
public class Main {
    static final String JBDC_DRIVER = "org.h2.Driver"; // Usaríamos esto si nuestra DB fuera embebida o servidor
    static final String DB_URL = "jdbc:h2:mem:;INIT=runscript from 'classpath:init.sql'"; // Trabajaríamos con una DB en memoria por motivos de tiempos y simplicidad

    // Database credentials
    static final String USER = "sa"; // Valores por defecto de login (si usaramos un servidor sería necesario)
    static final String PASS = ""; // valor por defecto de login (si usaramos un servidor sería necesario)

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try{
            // Conectamos a la DB
            conn = DriverManager.getConnection(DB_URL); // Realizamos la conexión a la DB
            stmt = conn.createStatement();

            /*
            // Hacemos un SELECT con "executeQuery", el resultado se guarda en rs, una instancia de ResultSet
            ResultSet rs = stmt.executeQuery("SELECT id, first, last, age FROM REGISTRATION");

            // Vamos a recorrer todos los elementos (Filas) de nuestra tabla resultante.
            System.out.println("\nMostrando por pantalla el resultado de la consulta:");
            while(rs.next()){
                // Mostramos los valores por pantalla (Aquí en vez de esto podríamos procesarlos, construir objetos nuevos, etc.)

                System.out.print("ID: " + rs.getInt(1));
                System.out.print(", First: " + rs.getString(2));
                System.out.println(", Last: " + rs.getString(3));
                System.out.print(", Age: " + rs.getInt(4));

                }

                // STEP 5: Clean-up environment
                rs.close();
                stmt.close();
                conn.close();

             */

            PreparedStatement insertPs = conn.prepareStatement("INSERT INTO REGISTRATION (first, last, age) VALUES (?, ?, ?)");
            insertPs.setString(1, "Juan");
            insertPs.setString(2, "Perez");
            insertPs.setInt(3, 25);
            int i = insertPs.executeUpdate();
            System.out.println("Filas afectadas: " + i);

            // Podemos reutilizar el PreparedStatement reiniciando los parámetros, la consulta ya está hecha.
            insertPs.setString(1, "Maria");
            insertPs.setString(2, "Gomez");
            insertPs.setInt(3, 30);
            i = insertPs.executeUpdate();
            System.out.println("Filas afectadas: " + i);

            // Ejectatamos el Select con PreparedStatement
            PreparedStatement selectPs = conn.prepareStatement("SELECT * FROM REGISTRATION");
            ResultSet rs = selectPs.executeQuery();

            System.out.println("\nMostrando por pantalla el resultado de la consulta:");
            while(rs.next()){
                // Obtenemos cada columna con el get correspondiente (int para enteros, String para cadenas, etc.)
                int id = rs.getInt("id");
                String first = rs.getString("first");
                String last = rs.getString("last");
                int age = rs.getInt("age");

                // Mostramos los valores por pantalla (Aquí en vez de esto podríamos procesarlos, construir objetos nuevos, etc.)
                System.out.print("ID: " + id);
                System.out.print(", First: " + first);
                System.out.print(", Last: " + last);
                System.out.println(", Age: " + age);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}