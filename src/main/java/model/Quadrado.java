package model;

public class Quadrado extends Poligono {

    private double lado;

    public Quadrado () {
        this.lado = 2;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
