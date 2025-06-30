package com.revisao.forma;

public class Quadrado extends Quadrilatero {
    private final double lado;

    public Quadrado(double lado) {
        super(lado, lado, lado, lado);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                ", area=" + calcularArea() +
                ", perimetro=" + calcularPerimetro() +
                '}';
    }
}
