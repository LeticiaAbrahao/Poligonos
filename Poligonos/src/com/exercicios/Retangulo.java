package com.exercicios;

public class Retangulo implements Poligono {

    private final int numLados = 4;
    private double altura, base;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public int getNumLados() {
        return numLados;
    }

    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public double perimetro() {
        return (base * 2) + (altura * 2);
    }
}
