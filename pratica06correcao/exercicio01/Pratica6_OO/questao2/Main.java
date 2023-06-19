package Pratica6_OO.questao2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nomeEmpresa, cnpj;
        int qtde_funcionario;
        nomeEmpresa = JOptionPane.showInputDialog("Digite o nome da empresa: ");
        cnpj = JOptionPane.showInputDialog("Digite o cnpj da empresa: ");
        qtde_funcionario = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionarios da empresa: "));
        Empresa empresa = new Empresa(nomeEmpresa, cnpj, qtde_funcionario);

        Funcionario fun = null;
        ArrayList<Funcionario> funcionarios = new ArrayList<>(100);
        for ( int i = 0;  i < 5; i++){
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionario: ");

            String email = JOptionPane.showInputDialog(null, "Digite o email do funcionario: ");

            String telefone = JOptionPane.showInputDialog(null, "Digite o telefone do funcionario: ");

            String departamento = JOptionPane.showInputDialog(null, "Digite o departamento: ");

            double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salario do funcionario: "));

            String dataDeEntrada = JOptionPane.showInputDialog(null, "Digite a data de entrada: ");

            String rg = JOptionPane.showInputDialog("Digite o rg do funcionario: ");
            boolean estaTrabalhando = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Digite true para sim ou false para não se o funcionario trabalha na empresa"));

            fun = new Funcionario(nome, email, telefone, departamento, salario, dataDeEntrada,rg, estaTrabalhando );
            funcionarios.add(fun);
        }

        for( int i = 0; i<funcionarios.size(); i++){
            funcionarios.get(i).mostrarDados();
        }

    }
}
