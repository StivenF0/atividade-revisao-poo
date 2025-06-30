package com.revisao.produto;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Produto> carrinho = new ArrayList<>();
        carrinho.add(new ProdutoInformatica("Mouse G Pro X Superlight", "Logitech, 16.000 DPI"));
        carrinho.add(new ProdutoInformatica("Monitor Gamer Ultragear", "LG, 144hz"));
        carrinho.add(new Livro("Sun Tzu", "A arte da guerra, 158pg"));
        carrinho.add(new Livro("Émile Zola", "Germinal, 560pg"));

        for (Produto p : carrinho) {
            System.out.println(p.getDescricao());
        }

        // O único tipo de polimorfismo utilizado foi a Sobrescrita.
    }
}
