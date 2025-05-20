package REVISAO.P6;

public class Cliente extends Pessoa {
    private int idade;
    private String cpf;
    private String status;

    public Cliente(String nome, String telefone, int idade, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.cpf = cpf;
        this.status = "A";
    }

    public void desativar() {
        if (status.equals("A")) status = "I";
    }

    public String mostrarDados() {
        return nome + " – Tel:" + telefone + " – idade: " + idade + " anos – cpf: " + cpf + " – " + (status.equals("A") ? "ativo" : "inativo");
    }
}
