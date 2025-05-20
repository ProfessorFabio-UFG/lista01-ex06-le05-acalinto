package REVISAO.P6;

public class Gerente extends Funcionario {
    private double bonificacao;
    private String tipo;

    public Gerente(String matricula, String nome) {
        super(matricula, nome);
    }

    public void setBonificacao(double b) { this.bonificacao = b; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public double getRecebimentoAnual() {
        return super.getRecebimentoAnual() + (bonificacao * 12);
    }
}

