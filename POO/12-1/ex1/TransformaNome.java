public class TransformaNome {
    String nome;

    public TransformaNome(String nome) {
        this.nome = nome;
    }

    public String maiusculo() {
        return nome.toUpperCase();
    }

    public String minusculo() {
        return nome.toLowerCase();
    }

    public int buscarBranco() {
        int qtde = 0;
        int i = 0;
        int pos = 0;

        while (pos >= 0) {
            pos = nome.indexOf(' ', i);

            if (pos >= 0) {
                qtde++;
                i = pos + 1;
            }
        }

        return qtde;
    }

    // Novo método
    public String inverterNome() {
        String invertido = "";

        for (int i = nome.length() - 1; i >= 0; i--) {
            invertido += nome.charAt(i);
        }

        return invertido;
    }

    // Novo método
    public int quantidadePalavras() {
        return buscarBranco() + 1;
    }
}