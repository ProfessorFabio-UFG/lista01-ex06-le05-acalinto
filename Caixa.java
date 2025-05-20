package REVISAO.P6;

public class Caixa extends Funcionario {
    private String horario;

    public Caixa(String matricula, String nome) {
        super(matricula, nome);
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
