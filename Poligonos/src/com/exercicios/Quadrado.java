package com.exercicios;

public class Quadrado implements Poligono {

    private final int numLados = 4;
    private double lado = 0;

    public Quadrado(double lado) {
        this.lado = lado;
    }


    public int getNumLados() {
        return numLados;
    }

    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public double perimetro() {
        return lado + lado + lado + lado;
    }
}
