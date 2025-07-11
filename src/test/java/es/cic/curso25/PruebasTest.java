package es.cic.curso25;

import org.junit.jupiter.api.Test;

public class PruebasTest {

    @Test
    public void acelerarRemotamente(Coche coche, int incremento){
        coche.acelerar(incremento);
    }

    @Test
    public void acelerarRemotamente(Camion camion, int incremento){
        camion.acelerar(incremento);
    }
}
