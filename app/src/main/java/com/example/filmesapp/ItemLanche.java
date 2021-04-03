package com.example.filmesapp;

public class ItemLanche {
    private String descricao;
    private int lanche;
    private Double preco;

    public ItemLanche(){

    }

    public ItemLanche(String descricao, int lanche, Double preco) {
        this.descricao = descricao;
        this.lanche = lanche;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getLanche() {
        return lanche;
    }

    public void setLanche(int lanche) {
        this.lanche = lanche;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
