package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        // Preparo
        Calculadora cut = new Calculadora();

        // Ejecuto
        cut.sumar(5.6);
        cut.sumar(3.4);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(9, valorActual, 0.000001);
    }

    @Test
    public void testRestar() {
        // Preparo
        Calculadora cut = new Calculadora();

        // Ejecuto
        cut.restar(5.6);
        cut.restar(3.4);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(-9, valorActual, 0.000001);
    }

    @Test
    public void testMultiplicar() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(4);

        // Ejecuto
        cut.mutiplicar(2);
        cut.mutiplicar(3);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(24, valorActual, 0.000001);
    }

    @Test
    public void testDividir() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(40);

        // Ejecuto
        cut.dividir(2);
        cut.dividir(5);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(4, valorActual, 0.000001);
    }

    @Test
    public void testDivisorEsCero() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(40);

        // Verifico que salta la excepción tras dividir por 0
        assertThrows(ArithmeticException.class, () -> cut.dividir(0));        
    }

    @Disabled
    @Test
    public void testDividendoEsCero() {
        // Preparo
        Calculadora cut = new Calculadora();

        cut.dividir(2);
        double valorActual = cut.getTotal();
        assertEquals(4, valorActual, 0.000001);

        // Verifico que salta la excepción tras dividir por 0
        //assertThrows(ArithmeticException.class, () -> cut.dividir(0));        
    }
}
