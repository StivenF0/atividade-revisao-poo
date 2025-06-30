package com.revisao.forma;

public class Retangulo extends Quadrilatero {
    private final double base, altura;

    public Retangulo(double base, double altura) {
        super(base, altura, base, altura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + calcularArea() +
                ", perimetro=" + calcularPerimetro() +
                '}';
    }
}
