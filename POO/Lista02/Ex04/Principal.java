public class Principal {
    public static void main(String[] args) {
        Robo robo1 = new Robo("Robo Azul", 10);
        Robo robo2 = new Robo("Robo Vermelho", 5);

        executarRotina(robo1, 3, 4, 4);
        System.out.println();
        executarRotina(robo2, 1, 2, 6);
    }

    private static void executarRotina(Robo robo, int x, int y, int po) {
        System.out.println(robo);
        robo.andar(x, y);
        System.out.println(robo);
        robo.ligar();
        System.out.println(robo);
        robo.andar(x, y);
        System.out.println(robo);
        robo.aspirar(po);
        System.out.println(robo);
        robo.parar();
        System.out.println(robo);
        robo.desligar();
        System.out.println(robo);
    }
}

class Robo {
    private String nome;
    private String status;
    private int posicaoX;
    private int posicaoY;
    private int quantidadePo;
    private int limitePo;

    public Robo(String nome, int limitePo) {
        this.nome = nome;
        this.limitePo = limitePo;
        this.status = "desligado";
    }

    public void ligar() {
        status = "parado";
    }

    public void desligar() {
        status = "desligado";
    }

    public void andar(int deslocamentoX, int deslocamentoY) {
        if (!estaLigado()) {
            System.out.println(nome + " nao pode andar desligado.");
            return;
        }

        posicaoX += deslocamentoX;
        posicaoY += deslocamentoY;
        status = "andando";
    }

    public void aspirar(int quantidade) {
        if (!estaLigado()) {
            System.out.println(nome + " nao pode aspirar desligado.");
            return;
        }

        quantidadePo += quantidade;
        if (quantidadePo >= limitePo) {
            quantidadePo = limitePo;
            System.out.println(nome + " atingiu o limite de po e sera desligado automaticamente.");
            desligar();
        }
    }

    public void parar() {
        if (!estaLigado()) {
            System.out.println(nome + " nao pode parar desligado.");
            return;
        }
        status = "parado";
    }

    private boolean estaLigado() {
        return !"desligado".equals(status);
    }

    @Override
    public String toString() {
        return nome
                + " | Status: " + status
                + " | Posicao: (" + posicaoX + ", " + posicaoY + ")"
                + " | Po: " + quantidadePo + "/" + limitePo;
    }
}
