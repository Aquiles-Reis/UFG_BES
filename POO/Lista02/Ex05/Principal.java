public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme(101, "Interestelar");
        filme1.setGenero("Ficcao Cientifica");
        filme1.setAno(2014);
        filme1.setAutorPrincipal("Christopher Nolan");

        Filme filme2 = new Filme(102, "Shrek");
        filme2.setGenero("Animacao");
        filme2.setAno(2001);
        filme2.setAutorPrincipal("Andrew Adamson");

        System.out.println(filme1);
        System.out.println(filme2);
    }
}

class Filme {
    private int codigo;
    private String nome;
    private String genero;
    private int ano;
    private String autorPrincipal;

    public Filme(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    public void setAutorPrincipal(String autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo
                + " | Nome: " + nome
                + " | Genero: " + genero
                + " | Ano: " + ano
                + " | Autor principal: " + autorPrincipal;
    }
}
