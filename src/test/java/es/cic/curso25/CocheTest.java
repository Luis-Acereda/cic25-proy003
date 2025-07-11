package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CocheTest {

    private Coche cut;

    @BeforeEach
    public void setUp(){
        cut = new Coche();
    }

    @Test
    void testAcelerar() {
        int velocidadFinal;
        velocidadFinal = cut.acelerar(34);
        velocidadFinal = cut.acelerar(23);

        assertEquals(57, velocidadFinal);
    }

    @Test
    void testAcelerarEnExceso() {
        int velocidadFinal;
        velocidadFinal = cut.acelerar(310);

        assertEquals(300, velocidadFinal);
    }

    @Test
    void testFrenar() {
        int velocidadFinal;
        cut.acelerar(34);
        velocidadFinal = cut.frenar(15);

        assertEquals(19, velocidadFinal);
    }
    
    @Test
    void testFrenarNegativo() {
        int velocidadFinal;
        cut.acelerar(10);
        velocidadFinal = cut.frenar(15);

        assertEquals(0, velocidadFinal);
    }
    
    @Test
    void testGetVelocidad() {
        cut.acelerar(34);
        int velocidadFinal = cut.getVelocidad();
        assertEquals(34, velocidadFinal);
    }

    @Test
    void testGetConsumo() {
        cut.acelerar(50);
        double consumoActual = cut.getConsumo();
        assertEquals(2.15, consumoActual, 0.00000001);

    }
}
