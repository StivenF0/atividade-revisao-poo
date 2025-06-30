package com.revisao.produto;

public class Livro extends Produto {
    public final String autor;

    public Livro(String autor, String descricao) {
        this.autor = autor;
        setDescricao(descricao);
    }

    @Override
    public String getCategoria() {
        return "Livraria";
    }

    @Override
    public String getDescricao() {
        return "autor: " + autor + ", descricao: " + super.getDescricao();
    }
}
