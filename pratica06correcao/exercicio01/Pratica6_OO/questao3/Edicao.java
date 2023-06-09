package Pratica6_OO.questao3;

import java.util.ArrayList;

public class Edicao {

    private int numero;
    private int volume;
    private String dataEdicao;
    private int triagem;

    private ArrayList<Artigo> artigos;

    public Edicao(int numero, int volume, String dataEdicao, int triagem) {
        this.numero = numero;
        this.volume = volume;
        this.dataEdicao = dataEdicao;
        this.triagem = triagem;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(String dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    public int getTriagem() {
        return triagem;
    }

    public void setTriagem(int triagem) {
        this.triagem = triagem;
    }
    public void adicionaArtigo(Artigo artigo) {
        this.artigos.add(artigo);
    }
}
