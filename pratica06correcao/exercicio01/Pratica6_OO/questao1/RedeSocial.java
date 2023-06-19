package Pratica6_OO.questao1;

import java.util.ArrayList;

public class RedeSocial {
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;

    ArrayList<Publicacao> publicacoes = new ArrayList<>();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;

    }
    public void inserePublicacao(Publicacao publi){
        publicacoes.add(publi);  // a cada vez que o metodo é chamado, ele irá inserir um dado do tipo de publicacao no array de publicacoes
    }
    public void imprimePublicacoes(){
        System.out.println("Total de publicações: " + Publicacao.getContadorPublicacao());
        for (int i = 0; i<publicacoes.size(); i++){  //for para rodar o array
            System.out.println("Data publicação: " +publicacoes.get(i).getDataPublicacao());  // publicacoes é objeto do array, get(i) é o que irá retornar do tamanho do array e getDataPublicacao() a cada vez que o array mostra ele retorna a data da publicacao
            System.out.println("Texto: " +publicacoes.get(i).getTextoPublicacao());

        }
    }
}
