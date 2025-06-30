package com.revisao.produto;

public abstract class Produto {
    private double preco;
    private String descricao;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            return;
        }

        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao.isEmpty()) {
            return;
        }

        this.descricao = descricao;
    }

    public abstract String getCategoria();
}
