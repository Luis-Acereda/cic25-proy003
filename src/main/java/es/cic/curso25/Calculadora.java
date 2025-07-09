package es.cic.curso25;

public class Calculadora extends Object {
    private double total;

    public double getTotal() {
        return total;
    }

    public void sumar(double valor) {
        total += valor;
    }

    public void restar(double valor) {
        total -= valor;
    }
}
