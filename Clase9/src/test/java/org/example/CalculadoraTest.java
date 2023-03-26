package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    final Calculadora calculadora = new Calculadora();

    @Test
    void sumar() {
        assertEquals(5, calculadora.sumar(2, 3));
        assertNotEquals(5, calculadora.sumar(2, 4));
    }

    @Test
    void restar() {
       assertEquals(5, calculadora.restar(10, 5));
       assertNotEquals(5, calculadora.restar(10, 4));
    }

    @Test
    void multiplicar() {
        assertEquals(10, calculadora.multiplicar(2, 5));
        assertEquals(21, calculadora.multiplicar(3, 7));
        assertNotEquals(10, calculadora.multiplicar(6, 5));
    }

    @Test
    void dividir() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
        assertEquals(2, calculadora.dividir(10, 5));
        assertNotEquals(2, calculadora.dividir(10, 4));
    }
}