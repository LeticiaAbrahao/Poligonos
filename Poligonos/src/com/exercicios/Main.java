package com.exercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o número de lados do polígono (3 ou 4): ");
        int numLados = scanner.nextInt();
        scanner.nextLine();

        //se o número de lados for válido o bloco executará
        if (ladoValido(numLados)) {
            //Se o número de lados for 3 é um triângulo
            if (numLados == 3) {
                System.out.println("TRIANGULO");
                System.out.println("Insira o tamanho de um lado: ");
                double lado = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Insira o tamanho de outro lado: ");
                double lado2 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Insira o tamanho da base: ");
                double base = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Insira o tamanho da altura: ");
                double altura = scanner.nextDouble();
                scanner.nextLine();

                Triangulo triangulo = new Triangulo(lado, lado2, base, altura);
                System.out.println("O triângulo é " + triangulo.getTipo());
                System.out.println("Área:" + triangulo.area());
                System.out.println("Perímetro: " + triangulo.perimetro());
            }
            //se o número de lados for 4 há algumas outras opções para escolher
            if (numLados == 4) {
                System.out.println("É um quadrado, retângulo ou losango?");
                String figura = scanner.nextLine().toLowerCase();

                //se for um quadrado
                if (figura.equals("quadrado")) {
                    System.out.println("Insira a medida de um lado: ");
                    double lado = scanner.nextDouble();
                    scanner.nextLine();
                    Quadrado quadrado = new Quadrado(lado);
                    System.out.println("Área: " + quadrado.area());
                    System.out.println("Perímetro: " + quadrado.perimetro());
                }

                //se for um retangulo
                if (figura.equals("retangulo")) {
                    System.out.println("Insira a medida do lado maior: ");
                    double altura = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Insira a medida do lado menor: ");
                    double base = scanner.nextDouble();
                    scanner.nextLine();
                    Retangulo retangulo = new Retangulo(base, altura);
                    System.out.println("Área: " + retangulo.area());
                    System.out.println("Perímetro: " + retangulo.perimetro());
                }

                //se for um losango
                if (figura.equals("losango")) {
                    System.out.println("Insira a medida de um lado: ");
                    double lado = scanner.nextDouble();
                    scanner.nextLine();
                    Losango losango = new Losango(lado);
                    System.out.println("Área: " + losango.area());
                    System.out.println("Perímetro: " + losango.perimetro());
                }
            }
        }
    }
    //validação do número de lados
    public static boolean ladoValido(int numLados){
        if (numLados >= 3 && numLados <=4){
            return true;
        } else {
            System.out.println("Inválido. Somente polígonos de 3 a 4 lados.");
            return false;
        }
    }
}