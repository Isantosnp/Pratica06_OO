package Pratica6_OO.questao2;

public class Funcionario extends Pessoa{
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;
    private boolean estaTrabalhando;

    public Funcionario(String nome, String email, String telefone, String departamento, double salario, String dataEntrada, String rg, boolean estaTrabalhando) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.estaTrabalhando = estaTrabalhando;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isEstaTrabalhando() {
        return estaTrabalhando;
    }

    public void setEstaTrabalhando(boolean estaTrabalhando) {
        this.estaTrabalhando = estaTrabalhando;
    }
    public void bonificar (double adicional){
        this.salario += adicional;
    }
    public void demitir(){
        this.estaTrabalhando = false;
    }
    public String mostrarDados() {
        return "Funcionario{" +
                "departamento ='" + getDepartamento() + '\'' +
                ", salàrio =" + getSalario() +
                ", dataEntrada ='" + getDataEntrada() + '\'' +
                ", rg='" + getRg() + '\'' +
                ", estaTrabalhando=" + getDepartamento() +
                '}';
    }
}
