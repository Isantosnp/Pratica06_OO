package Pratica6_OO.questao2;

public class Pessoa {
    private String nome;
    private String email;
    private String Telefone;

    public Pessoa(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        Telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
}
