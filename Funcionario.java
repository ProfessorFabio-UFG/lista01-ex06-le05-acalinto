package REVISAO.P6;

public class Funcionario extends Pessoa {
    protected String matricula;
    protected double salario;

    public Funcionario(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }

    public double getRecebimentoAnual() {
        return salario * 12;
    }
}
