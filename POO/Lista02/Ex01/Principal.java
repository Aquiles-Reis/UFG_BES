public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Joao Pedro");
        System.out.println("Aluno criado:");
        System.out.println(aluno);

        aluno.matricular(2026001, "Sistemas de Informacao", 2026);
        System.out.println("\nDepois da matricula:");
        System.out.println(aluno);

        aluno.setCurso("Engenharia de Software");
        aluno.setAno(2027);
        System.out.println("\nDepois da atualizacao:");
        System.out.println(aluno);
    }
}

class Aluno {
    private String nome;
    private int matricula;
    private int ano;
    private String curso;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void matricular(int matricula, String curso, int ano) {
        this.matricula = matricula;
        this.curso = curso;
        this.ano = ano;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome
                + " | Matricula: " + matricula
                + " | Curso: " + curso
                + " | Ano: " + ano;
    }
}
