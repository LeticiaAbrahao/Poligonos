package com.exercicios;

public class Losango implements Poligono {

    private final int numLados = 4;
    private double lado;

    public Losango (double lado){
        this.lado = lado;
    }


    public int getNumLados() {
        return numLados;
    }

    @Override
    public double area() {
        return (lado * lado/2);
    }

    @Override
    public double perimetro() {
        return lado+lado+lado+lado;
    }
}
