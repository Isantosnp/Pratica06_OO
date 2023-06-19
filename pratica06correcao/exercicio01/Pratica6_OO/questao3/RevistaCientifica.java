package Pratica6_OO.questao3;

public class RevistaCientifica {
    private String titulo;
    private long issn;
    private String peridicidade;
    private Edicao edicao;

    public RevistaCientifica(String titulo, long issn, String peridicidade) {
        this.titulo = titulo;
        this.issn = issn;
        this.peridicidade = peridicidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public String getPeridicidade() {
        return peridicidade;
    }

    public void setPeridicidade(String peridicidade) {
        this.peridicidade = peridicidade;
    }

    public void adicionaRevista( Edicao edicao){
        this.edicao = edicao;
    }
}
