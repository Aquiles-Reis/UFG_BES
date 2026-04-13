import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Java Basico", "Tecnologia", new Pessoa("Ana", "Maria", "Loureiro"), "Atlas", 2, 2020, "Sao Paulo"));
        livros.add(new Livro("Padroes de Projeto", "Tecnologia", new Pessoa("Carlos", "Henrique", "Mendes"), "Novatec", 1, 2018, "Rio de Janeiro"));
        livros.add(new Livro("Dom Casmurro", "Romance", new Pessoa("Machado", "", "de Assis"), "Principis", 3, 1899, "Rio de Janeiro"));
        livros.add(new Livro("Calculo I", "Educacao", new Pessoa("Paulo", "Roberto", "Silva"), "Saraiva", 5, 2021, "Belo Horizonte"));
        livros.add(new Livro("O Hobbit", "Fantasia", new Pessoa("John", "Ronald", "Tolkien"), "HarperCollins", 4, 1937, "Londres"));

        for (Livro livro : livros) {
            System.out.println(livro);
            System.out.println();
        }

        System.out.println("Total de livros criados: " + Livro.getTotalLivrosCriados());
        for (Map.Entry<String, Integer> entrada : Livro.getTotaisPorGenero().entrySet()) {
            System.out.println("Genero " + entrada.getKey() + ": " + entrada.getValue());
        }
    }
}

class Pessoa {
    private String nome;
    private String nomeIntermediario;
    private String sobrenome;

    public Pessoa(String nome, String nomeIntermediario, String sobrenome) {
        this.nome = nome;
        this.nomeIntermediario = nomeIntermediario;
        this.sobrenome = sobrenome;
    }

    public String getReferenciaAutor() {
        String inicialNome = nome.isBlank() ? "" : String.valueOf(Character.toUpperCase(nome.charAt(0)));
        String inicialIntermediario = nomeIntermediario.isBlank() ? "" : String.valueOf(Character.toUpperCase(nomeIntermediario.charAt(0)));
        return sobrenome.toUpperCase() + ", " + inicialNome + " " + inicialIntermediario;
    }
}

class Livro {
    private static int proximoCodigo = 1;
    private static final Map<String, Integer> totaisPorGenero = new LinkedHashMap<>();

    private int codigo;
    private String titulo;
    private String genero;
    private Pessoa autor;
    private String editora;
    private int edicao;
    private int ano;
    private String local;

    public Livro(String titulo, String genero, Pessoa autor, String editora, int edicao, int ano, String local) {
        this.codigo = proximoCodigo++;
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.ano = ano;
        this.local = local;
        totaisPorGenero.put(genero, totaisPorGenero.getOrDefault(genero, 0) + 1);
    }

    public static int getTotalLivrosCriados() {
        return proximoCodigo - 1;
    }

    public static Map<String, Integer> getTotaisPorGenero() {
        return totaisPorGenero;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + "\n"
                + "Titulo: " + titulo + "\n"
                + "Genero: " + genero + "\n"
                + "Editora: " + editora + "\n"
                + "Edicao: " + edicao + "\n"
                + "Ano: " + ano + "\n"
                + "Local: " + local + "\n"
                + "Referencia: " + autor.getReferenciaAutor() + ". " + titulo + ".";
    }
}
