package org.example;
import java.sql.*;
public class Main {
    static final String JBDC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";

    static final String USER = "sa";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println(conn.isValid(0));

            System.out.println("Se creó la base de datos...");
            stmt = conn.createStatement();
            String sql = "CREATE TABLE Departamentos " +
                    "(DepartamentoID varchar(4) NOT NULL,  " +
                    " Nombre varchar(45) NOT NULL, " +
                    " Presupuesto int, " +
                    " PRIMARY KEY (DepartamentoID))";
            stmt.executeUpdate(sql);

            System.out.println("Se creó la tabla Departamentos en la base de datos...");

            stmt.executeUpdate("INSERT INTO Departamentos VALUES ('D001', 'Logística', 970000)");
            stmt.executeUpdate("INSERT INTO Departamentos VALUES ('D002', 'Compras', 1970000)");
            stmt.executeUpdate("INSERT INTO Departamentos VALUES ('D003', 'Legales', 250000)");

            System.out.println("Se insertaron registros en la tabla Departamentos...");

            String sql2 = "CREATE TABLE Empleados " +
                    "(EmpleadoID varchar(4) NOT NULL, " +
                    " Nombre varchar(255) NOT NULL, " +
                    " Apellido varchar(255) NOT NULL, " +
                    " DNI int NOT NULL, " +
                    " Nacionalidad varchar(45), " +
                    " DepartamentoID varchar(4)," +
                    " PRIMARY KEY (EmpleadoID)," +
                    " FOREIGN KEY (DepartamentoID) REFERENCES Departamentos(DepartamentoID))";
            stmt.executeUpdate(sql2);

            System.out.println("Se creó la tabla Empleados en la base de datos...");

            stmt.executeUpdate("INSERT INTO Empleados VALUES ('E001', 'Juan', 'Perez', '34567890', 'Argentina', 'D002')");
            stmt.executeUpdate("INSERT INTO Empleados VALUES ('E002', 'Pepe', 'Argento', '24567890', 'Argentina', 'D001')");
            stmt.executeUpdate("INSERT INTO Empleados VALUES ('E003', 'Ana', 'Martinez', '14567890', 'Argentina', 'D003')");
            stmt.executeUpdate("INSERT INTO Empleados VALUES ('E004', 'Fernanda', 'Garcia', '25567890', 'Argentina', 'D001')");

            System.out.println("Se insertaron registros en la tabla Empleados...");

            System.out.println("La base de datos se conectó correctamente.");

            // Actualizar datos
            stmt.executeUpdate("UPDATE Empleados SET Nacionalidad = 'Estadounidense' WHERE EmpleadoID = 'E003'");
            stmt.executeUpdate("DELETE FROM Departamentos WHERE DepartamentoID = 'D003'");

            // Consultar datos
            ResultSet rs = stmt.executeQuery("SELECT Empleados.EmpleadoID, Empleados.Nombre, Empleados.Apellido, Departamentos.Nombre as Departamento " +
                    "FROM Empleados " +
                    "INNER JOIN Departamentos " +
                    "ON Empleados.DepartamentoID = Departamentos.DepartamentoID" +
                    "WHERE Departamentos.DepartamentoID = 'D001");
            ResultSet rs2 = stmt.executeQuery("SELECT * FROM Departamentos");


            // Extraer datos del ResultSet
            while(rs.next()){
                // Recuperar por nombre de columna
                String empleadoID= rs.getString("EmpleadoID");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Apellido");
                String departamento = rs.getString("Departamento");

                // Mostrar valores
                System.out.print("ID: " + empleadoID);
                System.out.print(", Nombre: " + nombre);
                System.out.print(", Apellido: " + apellido);
                System.out.println(", Departamento: " + departamento);
            }

            while(rs2.next()){
                // Recuperar por nombre de columna
                String departamentoID= rs2.getString("DepartamentoID");
                String nombre = rs2.getString("Nombre");
                String presupuesto = rs2.getString("Presupuesto");

                // Mostrar valores
                System.out.print("ID: " + departamentoID);
                System.out.print(", Nombre: " + nombre);
                System.out.println(", Presupuesto: " + presupuesto);
            }

            // Cerrar conexiones
            rs.close();
            rs2.close();
            stmt.close();
            conn.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
}