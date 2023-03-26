package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean deseaContinuar = true;
        ListaPersonas listaPersonas = new ListaPersonas();

        // Pedido de datos de las personas
        do {
            System.out.println("Ingrese su nombre:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese su apellido:");
            String apellido = scanner.nextLine();
            LocalDate fechaNacimiento = null;
            System.out.println("Ingrese su fecha de nacimiento en formato AAAA-MM-DD:");
                do {
                    try {
                        fechaNacimiento = LocalDate.parse(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("La fecha ingresada no es válida, ingrese nuevamente la fecha de nacimiento en formato AAAA-MM-DD:");
                    }
                } while (fechaNacimiento == null);

            // Consultar si quiere ingresar otra persona
            System.out.println("¿Desea ingresar otra persona? (s/n)");
            String respuesta = scanner.nextLine();

            switch (respuesta) {
                case "s":
                    deseaContinuar = true;
                    break;
                case "n":
                    deseaContinuar = false;
                    break;
                default:
                    System.out.println("La respuesta ingresada no es válida, se asume que no desea ingresar otra persona.");
                    deseaContinuar = false;
                    break;
            }
            //Persona persona = new Persona(nombre, apellido, fechaNacimiento);

            // Crear persona y agregar a la lista
            listaPersonas.agregarPersona(new Persona(nombre, apellido, fechaNacimiento));

            } while (deseaContinuar == true);

        System.out.println("Lista de personas: " + listaPersonas.getPersonas());
    }
}