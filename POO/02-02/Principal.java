import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de produtos da loja");
        System.out.println();

        System.out.println("Produto 1 - construtor com apenas o codigo");
        int codigo1 = lerInt(scanner, "Codigo: ");
        Produto produto1 = new Produto(codigo1);
        System.out.println("Agora use o metodo inserir para completar os dados do produto 1.");
        String nome1 = lerTexto(scanner, "Nome: ");
        int quantidade1 = lerInt(scanner, "Quantidade: ");
        String tipo1 = lerTexto(scanner, "Tipo: ");
        double valor1 = lerDouble(scanner, "Valor: ");
        produto1.inserir(nome1, quantidade1, tipo1, valor1);

        System.out.println();
        System.out.println("Produto 2 - construtor com codigo e nome");
        int codigo2 = lerInt(scanner, "Codigo: ");
        String nome2 = lerTexto(scanner, "Nome: ");
        Produto produto2 = new Produto(codigo2, nome2);
        int quantidade2 = lerInt(scanner, "Quantidade: ");
        String tipo2 = lerTexto(scanner, "Tipo: ");
        double valor2 = lerDouble(scanner, "Valor: ");
        produto2.inserir(nome2, quantidade2, tipo2, valor2);

        System.out.println();
        System.out.println("Produto 3 - construtor com codigo, nome e quantidade");
        int codigo3 = lerInt(scanner, "Codigo: ");
        String nome3 = lerTexto(scanner, "Nome: ");
        int quantidade3 = lerInt(scanner, "Quantidade: ");
        Produto produto3 = new Produto(codigo3, nome3, quantidade3);
        String tipo3 = lerTexto(scanner, "Tipo: ");
        double valor3 = lerDouble(scanner, "Valor: ");
        produto3.inserir(nome3, quantidade3, tipo3, valor3);

        System.out.println();
        System.out.println("Produto 4 - construtor com todos os dados");
        int codigo4 = lerInt(scanner, "Codigo: ");
        String nome4 = lerTexto(scanner, "Nome: ");
        int quantidade4 = lerInt(scanner, "Quantidade: ");
        String tipo4 = lerTexto(scanner, "Tipo: ");
        double valor4 = lerDouble(scanner, "Valor: ");
        Produto produto4 = new Produto(codigo4, nome4, quantidade4, tipo4, valor4);

        Produto[] produtos = {produto1, produto2, produto3, produto4};

        for (int i = 0; i < produtos.length; i++) {
            System.out.println();
            System.out.println("Operacoes com o produto " + (i + 1));
            System.out.println(produtos[i]);

            int quantidadeVenda = lerInt(scanner, "Quantidade para vender: ");
            System.out.println(produtos[i].vender(quantidadeVenda));
            System.out.println("Estoque apos venda: " + produtos[i]);

            int quantidadeCompra = lerInt(scanner, "Quantidade para comprar: ");
            produtos[i].comprar(quantidadeCompra);
            System.out.println("Estoque apos compra sem alterar valor: " + produtos[i]);

            int quantidadeCompraComValor = lerInt(scanner, "Quantidade para comprar com novo valor: ");
            double novoValor = lerDouble(scanner, "Novo valor do produto: ");
            produtos[i].comprar(quantidadeCompraComValor, novoValor);
            System.out.println("Dados apos compra com alteracao de valor: " + produtos[i]);
        }

        System.out.println();
        System.out.println("Comparacoes entre produtos usando o metodo igual:");
        System.out.println("Produto 1 e Produto 2: " + produto1.igual(produto2));
        System.out.println("Produto 2 e Produto 3: " + produto2.igual(produto3));
        System.out.println("Produto 3 e Produto 4: " + produto3.igual(produto4));

        scanner.close();
    }

    public static int lerInt(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return Integer.parseInt(scanner.nextLine());
    }

    public static double lerDouble(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return Double.parseDouble(scanner.nextLine().replace(",", "."));
    }

    public static String lerTexto(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }
}
