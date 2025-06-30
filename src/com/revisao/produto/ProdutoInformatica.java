package com.revisao.produto;

public class ProdutoInformatica extends Produto {
    private final String tipo;

    public ProdutoInformatica(String tipo, String descricao) {
        this.tipo = tipo;
        setDescricao(descricao);
    }

    @Override
    public String getCategoria() {
        return "Informatica";
    }

    @Override
    public String getDescricao() {
        return "tipo: " + tipo + ", descricao: " + super.getDescricao();
    }
}
