package org.example;

public class Main {
    public static void main(String[] args) {
        PersonaSinLombok unapersonaSinLombok = new PersonaSinLombok("Juan", "Perez");
        Persona unapersona = new Persona("Juan", "Perez");
        PersonaData unapersonaData = new PersonaData("Juan", "Perez");

        System.out.println(unapersonaSinLombok.toString());
        System.out.println(unapersona.toString());
        System.out.println(unapersonaData.toString());
    }
}