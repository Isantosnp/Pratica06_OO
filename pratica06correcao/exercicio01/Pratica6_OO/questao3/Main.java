package Pratica6_OO.questao3;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        String titulo = JOptionPane.showInputDialog(null, "Titulo da revista: ");
        long issn = Long.parseLong(JOptionPane.showInputDialog(null, "ISSN: "));
        String periodiciade = JOptionPane.showInputDialog(null, "Periodicidade: ");
        RevistaCientifica revistaCientifica = new RevistaCientifica(titulo, issn, periodiciade);

        Artigo art;
        ArrayList<Artigo> artigos= new ArrayList<>();
        for(int i = 0 ; i <10; i++){
            String tituloArtigo = JOptionPane.showInputDialog(null, "Título do artigo: ");
            String resumo = JOptionPane.showInputDialog(null, "Escreva um breve resumo sobre o artigo: ");
            String autores = JOptionPane.showInputDialog(null, " Autor(es): ");
            art = new Artigo(tituloArtigo, resumo, autores);

            Edicao edicao;
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero: "));
            int volume = Integer.parseInt(JOptionPane.showInputDialog(null, "Volume: "));
            String dataEdicao = JOptionPane.showInputDialog(null, "Data da edição: ");
            int triagem = Integer.parseInt(JOptionPane.showInputDialog(null, "Triagem: "));
            edicao = new Edicao(numero, volume, dataEdicao, triagem);
            edicao.adicionaArtigo(art);
            revistaCientifica.adicionaRevista(edicao);
        }
    }
}
