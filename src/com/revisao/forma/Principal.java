package com.revisao.forma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas formas deseja criar? ");
        int n = scanner.nextInt();

        List<Forma> formas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Qual forma deseja criar?");
            System.out.println("(a) - Quadrado");
            System.out.println("(b) - Retangulo");
            System.out.println("(c) - Circulo");

            System.out.print("Forma: ");
            char forma = scanner.next().charAt(0);

            switch (forma) {
                case 'a':
                    adicionarQuadrado(formas, scanner);
                    break;
                case 'b':
                    adicionarRetangulo(formas, scanner);
                    break;
                case 'c':
                    adicionarCirculo(formas, scanner);
                    break;
                default:
                    System.out.println("Nenhuma forma adicionada!");
                    i--;
            }
        }

        scanner.close();

        for (Forma f : formas) {
            System.out.println(f);
        }
    }

    public static void adicionarQuadrado(List<Forma> formas, Scanner scanner) {
        System.out.println("Criando quadrado...");
        System.out.print("Tamanho do lado: ");

        Quadrado quadrado = new Quadrado(scanner.nextDouble());
        formas.add(quadrado);
    }

    public static void adicionarRetangulo(List<Forma> formas, Scanner scanner) {
        System.out.println("Criando retangulo...");
        System.out.print("Base: ");
        double base = scanner.nextDouble();
        System.out.print("Altura: ");
        double altura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(base, altura);
        formas.add(retangulo);
    }

    public static void adicionarCirculo(List<Forma> formas, Scanner scanner) {
        System.out.println("Criando circulo...");
        System.out.print("Tamanho do raio: ");

        Circulo circulo = new Circulo(scanner.nextDouble());
        formas.add(circulo);
    }
}
