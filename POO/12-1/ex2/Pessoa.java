public class Pessoa {

    private String nome;
    private double salario;
    private int dependentes;
    private int idade;

    public Pessoa(String nome, double salario,
                  int dependentes, int idade) {

        this.nome = nome;
        this.salario = salario;
        this.dependentes = dependentes;
        this.idade = idade;
    }

    public double calculaImposto() {

        if (idade >= 65) {
            return 0;
        }

        double imposto;

        if (salario <= 1787.77) {
            imposto = 0;
        }
        else if (salario <= 2679.29) {
            imposto = salario * 0.075 - 134.08;
        }
        else if (salario <= 3572.43) {
            imposto = salario * 0.15 - 335.03;
        }
        else if (salario <= 4463.81) {
            imposto = salario * 0.225 - 602.96;
        }
        else {
            imposto = salario * 0.275 - 826.15;
        }

        imposto -= dependentes * 179.71;

        if (imposto < 0) {
            imposto = 0;
        }

        return imposto;
    }
}