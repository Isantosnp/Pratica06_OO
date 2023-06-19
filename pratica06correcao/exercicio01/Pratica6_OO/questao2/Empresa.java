package Pratica6_OO.questao2;

import java.util.ArrayList;

public class Empresa {
    private String nomeEmpresa;
    private String cnpj;
    private int qtde_funcionario;
    ArrayList<Funcionario> funcionarios = new ArrayList<>(100);

    public Empresa(String nomeEmpresa, String cnpj, int qtde_funcionario) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.qtde_funcionario = qtde_funcionario;
    }
}
