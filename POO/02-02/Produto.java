public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private double valor;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(int codigo, String nome, int quantidade, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String vender(int quantidadeVendida) {
        if (quantidadeVendida <= 0) {
            return "Quantidade para venda invalida.";
        }

        if (quantidadeVendida > quantidade) {
            return "Estoque insuficiente para a venda do produto " + nome + ".";
        }

        quantidade -= quantidadeVendida;
        double totalVenda = quantidadeVendida * valor;
        return "Venda realizada com sucesso. Total da venda: R$ " + String.format("%.2f", totalVenda);
    }

    public void comprar(int quantidadeComprada, double novoValor) {
        if (quantidadeComprada > 0) {
            quantidade += quantidadeComprada;
        }
        valor = novoValor;
    }

    public void comprar(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            quantidade += quantidadeComprada;
        }
    }

    public void inserir(String nome, int quantidade, String tipo, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public boolean igual(Produto outroProduto) {
        if (outroProduto == null) {
            return false;
        }

        boolean nomesIguais = nome != null && nome.equals(outroProduto.nome);
        boolean tiposIguais = tipo != null && tipo.equals(outroProduto.tipo);
        return nomesIguais && tiposIguais;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo
                + " | Nome: " + nome
                + " | Quantidade em estoque: " + quantidade
                + " | Tipo: " + tipo
                + " | Valor: R$ " + String.format("%.2f", valor);
    }
}
