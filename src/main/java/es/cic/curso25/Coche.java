package es.cic.curso25;

public class Coche {

    public static final double CONSUMO_INSTANTANEO = 4.3;

    private Calculadora calculadora;
    
    private int velocidad;

    public Coche(){
        this.calculadora = new Calculadora();
    }

    public int getVelocidad(){
        return velocidad;
    }

    public double getConsumo(){   
        calculadora.limpiar();
        calculadora.sumar(velocidad);
        calculadora.dividir(100);
        calculadora.mutiplicar(CONSUMO_INSTANTANEO);
        
        return calculadora.getTotal();       
    }

    public int acelerar(int incrementoVelocidad){
        calculadora.limpiar();
        calculadora.sumar(velocidad);
        calculadora.sumar(incrementoVelocidad);

        velocidad = (int) Math.round(calculadora.getTotal()); // getTotal() devuelve un double y lo paso a int.

        if (velocidad > 300){
            return 300;
        } else {
            return velocidad;
        }
    }

    public int frenar(int decrementoVelocidad){
        calculadora.limpiar();
        calculadora.sumar(velocidad);
        calculadora.restar(decrementoVelocidad);

        velocidad = (int) Math.round(calculadora.getTotal()); // getTotal() devuelve un double y lo paso a int.

        if (velocidad < 0){
            return 0;
        } else {
            return velocidad;
        }
    }
}
