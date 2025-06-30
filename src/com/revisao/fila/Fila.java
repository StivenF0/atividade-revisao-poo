package com.revisao.fila;

public interface Fila<T> {
    void add(T item);
    T remove();
    boolean isEmpty();
    boolean isFull();
}
