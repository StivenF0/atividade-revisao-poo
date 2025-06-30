package com.revisao.fila;

import java.util.NoSuchElementException;

public class Principal {
    public static void main(String[] args) {
        FilaPadrao<Integer> fila = new FilaPadrao<>();

        try {
            for (int i = 0; i < 11; i++) {
                System.out.println("Adicionando: " + i);
                fila.add(i);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Erro: " + e);
        }

        try {
            for (int i = 0; i < 11; i++) {
                int item = fila.remove();
                System.out.println("Item removido: " + item);
            }
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e);
        }
    }
}
