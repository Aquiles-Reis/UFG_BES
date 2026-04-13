import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Funcionario> equipe = new ArrayList<>();

        equipe.add(new Funcionario("Ana", 2500.0, 250.0));
        equipe.add(new Funcionario("Bruno", 2700.0, 200.0));
        equipe.add(new Funcionario("Carla", 3200.0, 300.0));
        equipe.add(new Funcionario("Diego", 2900.0, 180.0));
        equipe.add(new Funcionario("Erika", 3100.0, 220.0));

        equipe.add(new Gerente("Fabio", 6000.0, 800.0, 1500.0));
        equipe.add(new Gerente("Gabriela", 6500.0, 900.0, 1700.0));

        equipe.add(new Vendedor("Helena", 2200.0, 100.0, 350.0));
        equipe.add(new Vendedor("Igor", 2300.0, 120.0, 400.0));
        equipe.add(new Vendedor("Julia", 2400.0, 130.0, 380.0));
        equipe.add(new Vendedor("Kaio", 2100.0, 110.0, 320.0));
        equipe.add(new Vendedor("Lara", 2600.0, 140.0, 450.0));

        Empresa empresa = new Empresa("Tech Solucoes");
        for (Funcionario funcionario : equipe) {
            empresa.adicionarFuncionario(funcionario);
        }

        System.out.println("Funcionarios cadastrados:");
        empresa.mostrarFuncionarios();

        System.out.println("\nAplicando aumento de 10%:");
        empresa.aplicarAumentoGeral(10);
        empresa.mostrarFuncionarios();
    }
}

class Empresa {
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void aplicarAumentoGeral(double percentual) {
        for (Funcionario funcionario : funcionarios) {
            funcionario.aumentarSalario(percentual);
        }
    }

    public void mostrarFuncionarios() {
        System.out.println("Empresa: " + nome);
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
            System.out.println("Proventos anuais: R$ " + String.format("%.2f", funcionario.calcularProventosAnuais()));
        }
    }
}

class Funcionario {
    private String nome;
    private double salario;
    private double bonificacao;

    public Funcionario(String nome, double salario, double bonificacao) {
        this.nome = nome;
        this.salario = salario;
        this.bonificacao = bonificacao;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100.0);
    }

    public double calcularProventosAnuais() {
        return (salario + bonificacao) * 12;
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome
                + " | Salario: R$ " + String.format("%.2f", salario)
                + " | Bonificacao: R$ " + String.format("%.2f", bonificacao);
    }
}

class Gerente extends Funcionario {
    private double gratificacaoGerencial;

    public Gerente(String nome, double salario, double bonificacao, double gratificacaoGerencial) {
        super(nome, salario, bonificacao);
        this.gratificacaoGerencial = gratificacaoGerencial;
    }

    @Override
    public double calcularProventosAnuais() {
        return (getSalario() + getBonificacao() + gratificacaoGerencial) * 12;
    }

    @Override
    public String toString() {
        return "Gerente: " + getNome()
                + " | Salario: R$ " + String.format("%.2f", getSalario())
                + " | Bonificacao: R$ " + String.format("%.2f", getBonificacao())
                + " | Gratificacao: R$ " + String.format("%.2f", gratificacaoGerencial);
    }
}

class Vendedor extends Funcionario {
    private double comissaoMensal;

    public Vendedor(String nome, double salario, double bonificacao, double comissaoMensal) {
        super(nome, salario, bonificacao);
        this.comissaoMensal = comissaoMensal;
    }

    @Override
    public double calcularProventosAnuais() {
        return ((getSalario() + getBonificacao()) * 12) + (comissaoMensal * 12);
    }

    @Override
    public String toString() {
        return "Vendedor: " + getNome()
                + " | Salario: R$ " + String.format("%.2f", getSalario())
                + " | Bonificacao: R$ " + String.format("%.2f", getBonificacao())
                + " | Comissao mensal: R$ " + String.format("%.2f", comissaoMensal);
    }
}
