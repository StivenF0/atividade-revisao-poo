package com.revisao.forma;

public abstract class Quadrilatero implements Forma {
    private final double lado1, lado2, lado3, lado4;

    public Quadrilatero(double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3 + lado4;
    }
}
