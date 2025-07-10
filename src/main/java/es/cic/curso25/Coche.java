package es.cic.curso25;

public class Coche {

    public static final double CONSUMO_INSTANTANEO = 4.3;
    
    private int velocidad;

    public int getVelocidad(){
        return velocidad;
    }

    public double getConsumo(){        
        double consumoActual = (double) velocidad * CONSUMO_INSTANTANEO / 100;
        return consumoActual;        
    }

    public int acelerar(int incrementoVelocidad){
        velocidad += incrementoVelocidad;
        return velocidad;
    }

    public int frenar(int decrementoVelocidad){
        velocidad -= decrementoVelocidad;
        if (velocidad < 0){
            return 0;
        } else {
            return velocidad;
        }
    }
}
