package com.exercicios;

public class Triangulo implements Poligono {

    private final int numLados = 3;
    private String tipo;
    private double lado1, lado2, base, altura;

    public Triangulo (double lado1, double lado2, double base, double altura ) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
        calcularTipo();
    }

    public void calcularTipo () {
        if (lado1 == lado2 && lado1 == base){
            this.tipo = "Equilátero";
        } else if (lado1 != lado2 && lado1 != base && lado2 != base){
            this.tipo = "Escaleno";
        } else {
            this.tipo = "Isósceles";
        }
    }

    public String getTipo(){
        return this.tipo;
    }

    @Override
    public double area() {
        return (base * altura)/2;
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + base;
    }

}
