package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Calculadora calculadora = new Calculadora();

            System.out.println("Suma: " + calculadora.sumar(2, 3));
            System.out.println("Resta: " + calculadora.restar(10, 5));
            System.out.println("Multiplicación: " + calculadora.multiplicar(2, 5));
            System.out.println("División: " + calculadora.dividir(10, 5));
            System.out.println("División por cero: " + calculadora.dividir(8, 0));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}