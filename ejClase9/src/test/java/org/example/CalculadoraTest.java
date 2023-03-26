package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    final Calculadora calculadora = new Calculadora();

    @Test
    void sumar() {
    }

    @Test
    void restar() {
    }

    @Test
    void multiplicar() {
        assertEquals(240, calculadora.multiplicar(80, 3));
        assertNotEquals(605, calculadora.multiplicar(calculadora.restar(90, 50), 15));
        assertNotEquals(2700, calculadora.multiplicar(calculadora.sumar(70, 40), 25));
    }

    @Test
    void dividir() {
        assertEquals(110, calculadora.dividir(calculadora.sumar(150, 180), 3));
    }
}