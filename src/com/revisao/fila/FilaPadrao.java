package com.revisao.fila;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class FilaPadrao<T> implements Fila<T> {
    public static final int CAPACIDADE_MAXIMA = 10;
    private final List<T> fila = new ArrayList<T>();

    public FilaPadrao() {}

    @Override
    public void add(T item) {
        if (isFull()) {
            throw new NoSuchElementException("A fila está cheia!");
        }
        fila.add(item);
    }

    @Override
    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia!");
        }
        return fila.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return fila.isEmpty();
    }

    @Override
    public boolean isFull() {
        if (fila.size() == CAPACIDADE_MAXIMA) {
            return true;
        }

        return false;
    }
}
