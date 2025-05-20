package REVISAO.P6;

public class CadastroBanco {
    public static void main(String[] args) {
        Caixa caixa = new Caixa("001", "João");
        caixa.telefone = "1234-5678";
        caixa.salario = 2000;
        caixa.aumentarSalario(10);
        System.out.println("Salário anual do caixa: " + caixa.getRecebimentoAnual());

        Gerente gerente = new Gerente("002", "Maria");
        gerente.telefone = "9876-5432";
        gerente.salario = 5000;
        gerente.setBonificacao(1000);
        gerente.setTipo("PF");
        gerente.aumentarSalario(20);
        System.out.println("Salário anual do gerente: " + gerente.getRecebimentoAnual());

        Cliente c1 = new Cliente("Pedro", "1111-1111", 30, "123456789");
        Cliente c2 = new Cliente("Ana", "2222-2222", 25, "987654321");
        Cliente c3 = new Cliente("Carlos", "3333-3333", 40, "456789123");
        c2.desativar();

        System.out.println(c1.mostrarDados());
        System.out.println(c2.mostrarDados());
        System.out.println(c3.mostrarDados());
    }
}
