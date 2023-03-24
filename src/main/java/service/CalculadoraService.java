package service;

import model.Poligono;
import model.Quadrado;
import model.Triangulo;

public class CalculadoraService {

    public int somar(int a, int b) {
        return a+b;
    }

    public int subtrair(int a, int b) {
        return a-b;
    }

    public int dividir(int a, int b) {
        return a/b;
    }

    public int multiplicar(int a, int b) {
        return a*b;
    }

    public double calcularArea(Poligono poligono) {
        if (poligono instanceof Quadrado) {
            return poligono.calcularArea();
        } else if (poligono instanceof Triangulo) {
            return poligono.calcularArea();
        } else {
            throw new IllegalArgumentException("Polígono inválido.");
        }
    }

    public Triangulo identificarTrianguloDeMenorArea(Triangulo triangulo1, Triangulo triangulo2) {
        double areaT1 = calcularArea(triangulo1);
        double areaT2 = calcularArea(triangulo2);

        if (areaT1 < areaT2) {
            return triangulo1;
        } else if (areaT2 < areaT1) {
            return triangulo2;
        } else {
            return null;
        }
    }
    public Quadrado identificarQuadradoDeMenorArea(Quadrado quadrado1, Quadrado quadrado2) {
        double areaQ1 = calcularArea(quadrado1);
        double areaQ2 = calcularArea(quadrado2);

        if (areaQ1 < areaQ2) {
            return quadrado1;
        } else if (areaQ2 < areaQ1) {
            return quadrado2;
        } else {
            return null;
        }
    }

}
