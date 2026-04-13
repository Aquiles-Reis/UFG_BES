public class Principal {
    public static void main(String[] args) {
        Item[] itens = new Item[10];

        itens[0] = new CD("Thriller", 1982, 42, "Album classico", "Michael Jackson", 9);
        itens[1] = new Filme("Matrix", 1999, 136, "Ficcao cientifica", "Wachowski");
        itens[2] = new Jogo("FIFA 26", 2026, 90, "Jogo esportivo", 4, "PC");
        itens[3] = new CD("Back in Black", 1980, 41, "Rock", "AC/DC", 10);
        itens[4] = new Filme("Toy Story", 1995, 81, "Animacao", "John Lasseter");
        itens[5] = new Jogo("Minecraft", 2011, 999, "Sandbox", 8, "Multiplataforma");
        itens[6] = new CD("25", 2015, 48, "Pop", "Adele", 11);
        itens[7] = new Filme("Vingadores", 2012, 143, "Herois", "Joss Whedon");
        itens[8] = new Jogo("The Last of Us", 2013, 900, "Aventura", 1, "PlayStation");
        itens[9] = new Filme("Parasita", 2019, 132, "Suspense", "Bong Joon-ho");

        for (Item item : itens) {
            System.out.println(item.exibirDados());
            System.out.println(item.exibirDetalhes());
            if (item instanceof Jogo jogo) {
                System.out.println("Plataforma do jogo: " + jogo.getPlataforma());
            }
            System.out.println();
        }
    }
}

abstract class Item {
    private String titulo;
    private int ano;
    private int tempoDuracao;
    private String comentarios;

    public Item(String titulo, int ano, int tempoDuracao, String comentarios) {
        this.titulo = titulo;
        this.ano = ano;
        this.tempoDuracao = tempoDuracao;
        this.comentarios = comentarios;
    }

    public String exibirDados() {
        return "Titulo: " + titulo
                + " | Ano: " + ano
                + " | Duracao: " + tempoDuracao
                + " | Comentarios: " + comentarios;
    }

    public abstract String exibirDetalhes();
}

class CD extends Item {
    private String artista;
    private int quantidadeFaixas;

    public CD(String titulo, int ano, int tempoDuracao, String comentarios, String artista, int quantidadeFaixas) {
        super(titulo, ano, tempoDuracao, comentarios);
        this.artista = artista;
        this.quantidadeFaixas = quantidadeFaixas;
    }

    @Override
    public String exibirDetalhes() {
        return "CD | Artista: " + artista + " | Faixas: " + quantidadeFaixas;
    }
}

class Filme extends Item {
    private String diretor;

    public Filme(String titulo, int ano, int tempoDuracao, String comentarios, String diretor) {
        super(titulo, ano, tempoDuracao, comentarios);
        this.diretor = diretor;
    }

    @Override
    public String exibirDetalhes() {
        return "Filme | Diretor: " + diretor;
    }
}

class Jogo extends Item {
    private int numeroJogadores;
    private String plataforma;

    public Jogo(String titulo, int ano, int tempoDuracao, String comentarios, int numeroJogadores, String plataforma) {
        super(titulo, ano, tempoDuracao, comentarios);
        this.numeroJogadores = numeroJogadores;
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    @Override
    public String exibirDetalhes() {
        return "Jogo | Jogadores: " + numeroJogadores + " | Plataforma: " + plataforma;
    }
}
