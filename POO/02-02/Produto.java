public class Produto {
    private static int proximoCodigo = 1;

    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private double valor;

    public Produto() {
        this.codigo = proximoCodigo++;
    }

    public Produto(String nome) {
        this();
        setNome(nome);
    }

    public Produto(String nome, int quantidade) {
        this(nome);
        setQuantidade(quantidade);
    }

    public Produto(String nome, int quantidade, String tipo, double valor) {
        this(nome, quantidade);
        setTipo(tipo);
        setValor(valor);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        }
    }

    public String vender(int quantidadeVendida) {
        if (quantidadeVendida <= 0) {
            return "Quantidade para venda invalida.";
        }

        if (quantidadeVendida > getQuantidade()) {
            return "Estoque insuficiente para a venda do produto " + getNome() + ".";
        }

        setQuantidade(getQuantidade() - quantidadeVendida);
        double totalVenda = quantidadeVendida * getValor();
        return "Venda realizada com sucesso. Total da venda: R$ " + String.format("%.2f", totalVenda);
    }

    public void comprar(int quantidadeComprada, double novoValor) {
        if (quantidadeComprada > 0) {
            setQuantidade(getQuantidade() + quantidadeComprada);
        }
        setValor(novoValor);
    }

    public void comprar(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            setQuantidade(getQuantidade() + quantidadeComprada);
        }
    }

    public void inserir(String nome, int quantidade, String tipo, double valor) {
        setNome(nome);
        setQuantidade(quantidade);
        setTipo(tipo);
        setValor(valor);
    }

    public boolean igual(Produto outroProduto) {
        if (outroProduto == null) {
            return false;
        }

        boolean nomesIguais = getNome() != null && getNome().equals(outroProduto.getNome());
        boolean tiposIguais = getTipo() != null && getTipo().equals(outroProduto.getTipo());
        return nomesIguais && tiposIguais;
    }

    @Override
    public String toString() {
        return "Codigo: " + getCodigo()
                + " | Nome: " + getNome()
                + " | Quantidade em estoque: " + getQuantidade()
                + " | Tipo: " + getTipo()
                + " | Valor: R$ " + String.format("%.2f", getValor());
    }
}
