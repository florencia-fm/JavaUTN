package org.example;
import java.sql.*;
public class Main {
    static final String DB_URL = "jdbc:h2:mem:;INIT=runscript from 'classpath:init.sql'";
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();

            // Insertar nuevo empleado
            PreparedStatement insertPS = conn.prepareStatement("INSERT INTO Empleados VALUES (?, ?, ?, ?, ?, ?)");
            insertPS.setString(1, "E005");
            insertPS.setString(2, "Fernando");
            insertPS.setString(3, "Gonzalez");
            insertPS.setInt(4, 34567891);
            insertPS.setString(5, "Argentina");
            insertPS.setString(6, "D002");
            insertPS.executeUpdate();

            // Actualizar nacionalidad empleado
            PreparedStatement updateNacionalidadPS = conn.prepareStatement("UPDATE Empleados SET Nacionalidad = ? WHERE EmpleadoID = ?");
            updateNacionalidadPS.setString(1, "Estadounidense");
            updateNacionalidadPS.setString(2, "E002");
            updateNacionalidadPS.executeUpdate();

            // Eliminar un departamento
                // Primero movemos los empleados del departamento a borrar a otro departamento, sino no deja eliminar. También se podrían eliminar los empleados child del departamento a borrar.
            PreparedStatement updateDepartamentoPS = conn.prepareStatement("UPDATE Empleados SET DepartamentoID = ? WHERE DepartamentoID = ?");
            updateDepartamentoPS.setString(1, "D002");
            updateDepartamentoPS.setString(2, "D003");
            updateDepartamentoPS.executeUpdate();
                // Luego borramos el departamento
            PreparedStatement deleteDepartamentoPS = conn.prepareStatement("DELETE FROM Departamentos WHERE DepartamentoID = ?");
            deleteDepartamentoPS.setString(1, "D003");
            deleteDepartamentoPS.executeUpdate();

            // Consultar empleados de Logística con INNER JOIN para mostrar el nombre del departamento en lugar del ID
            PreparedStatement selectPS = conn.prepareStatement("SELECT * FROM Empleados " +
                    "INNER JOIN Departamentos ON Empleados.DepartamentoID = Departamentos.DepartamentoID " +
                    "WHERE Empleados.DepartamentoID = ?");
            selectPS.setString(1, "D001");
            ResultSet rsEmpleados = selectPS.executeQuery();

            while (rsEmpleados.next()){
                System.out.print("ID: " + rsEmpleados.getString("EmpleadoID"));
                System.out.print(", Nombre: " + rsEmpleados.getString("Nombre"));
                System.out.print(", Apellido: " + rsEmpleados.getString("Apellido"));
                System.out.println(", Departamento: " + rsEmpleados.getString("DepartamentoS.Nombre"));
            }

            // Mostrar todos los departamentos
            PreparedStatement selectAllDepartamentosPS = conn.prepareStatement("SELECT * FROM Departamentos");
            ResultSet rsDepartamentos = selectAllDepartamentosPS.executeQuery();

            while (rsDepartamentos.next()){
                System.out.print("ID: " + rsDepartamentos.getString(1));
                System.out.println(", Nombre: " + rsDepartamentos.getString(2));
            }

            // Cerrar conexiones
            rsEmpleados.close();
            rsDepartamentos.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}