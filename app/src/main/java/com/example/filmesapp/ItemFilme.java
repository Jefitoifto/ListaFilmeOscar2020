package com.example.filmesapp;

public class ItemFilme {

    private String nomeFilme;
    private int filme;

    public ItemFilme(String nomeFilme, int filme) {
        this.nomeFilme = nomeFilme;
        this.filme = filme;
    }

    public ItemFilme(){

    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public int getFilme() {
        return filme;
    }

    public void setFilme(int filme) {
        this.filme = filme;
    }


}
