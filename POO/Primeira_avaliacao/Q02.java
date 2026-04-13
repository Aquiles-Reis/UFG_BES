package POO.Primeira_avaliacao;

class Sanduiche {
    private String nome;
    private double valor;
    private double calorias;
    private double proteinas;
    private double gorduras;
    private double carboidratos;
    private double fibras;

    public Sanduiche(String nome, double valor, double calorias, double proteinas,
            double gorduras, double carboidratos, double fibras) {
        this.nome = nome;
        this.valor = valor;
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.gorduras = gorduras;
        this.carboidratos = carboidratos;
        this.fibras = fibras;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public double getCalorias() {
        return calorias;
    }

    public double getProteinas() {
        return proteinas;
    }

    public double getGorduras() {
        return gorduras;
    }

    public double getCarboidratos() {
        return carboidratos;
    }

    public double getFibras() {
        return fibras;
    }

    public String retornarTabelaNutricional() {
        return "Tabela Nutricional do sanduiche " + nome
                + ": calorias = " + calorias
                + ", proteinas = " + proteinas
                + ", gorduras = " + gorduras
                + ", carboidratos = " + carboidratos
                + ", fibras = " + fibras;
    }

    public double calcularValorComTaxaServico(double taxaServico) {
        return valor + taxaServico;
    }
}
