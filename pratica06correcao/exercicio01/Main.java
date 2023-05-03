package pratica06correcao.exercicio01;

import pratica06.exercicio01.Publicacao;
import pratica06.exercicio01.RedeSocial;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nomeUsuario, dataCriacao, dataNascimento, senha, dataPubliA, textoPubliA, linkMidiaA, dataPubliB, textoPubliB, linkMidiaB;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome do seu usuário: ");
        nomeUsuario = teclado.next();
        System.out.println("Data de nascimento: ");
        dataNascimento = teclado.next();
        System.out.println("Data da criação da conta: ");
        dataCriacao = teclado.next();
        System.out.println("Senha do usuário: ");
        senha = teclado.next();
        RedeSocial redeSocial = new RedeSocial( dataCriacao, nomeUsuario,  dataNascimento,  senha);

        pratica06correcao.exercicio01.Publicacao publi1;

        ArrayList<Publicacao> publi = new ArrayList<>();
       for (int i = 0; i < 3; i++){
           System.out.println("Data da Publicação :");
           dataPubliA = teclado.next();
           System.out.println("Texto da publicação  ");
           textoPubliA = teclado.next();
           System.out.println("Link da Midia ");
           linkMidiaA = teclado.next();

           publi1 = new pratica06correcao.exercicio01.Publicacao(dataPubliA, textoPubliA, linkMidiaA);
           publi.add(publi1);



       }





    }
}
