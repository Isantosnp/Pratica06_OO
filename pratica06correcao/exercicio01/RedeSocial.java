package pratica06correcao.exercicio01;

import java.util.ArrayList;

public class RedeSocial {
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;

    ArrayList<Publicacao> publicacoes = new ArrayList<>();

    void inserePublicacao(Publicacao publi){
        publicacoes.add(publi);
    }

    void inserePublicacoes(){
        System.out.println("Total de publicações: " +Publicacao.getContadorPublicacao());
         for ( int i = 0; i > publicacoes.size(); i++){
             System.out.println("Data Publicações: " + publicacoes.get(i).getDataPublicacao()); // Para buscar posição por posição da do metodo get de uma variável
         }
    }

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;

    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
