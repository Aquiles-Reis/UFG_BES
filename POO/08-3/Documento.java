/**
 * Classe abstrata que representa o produto base no padrao Factory Method.
 */
public abstract class Documento {
    private final int numero;
    private final String remetente;
    private final String tipo;

    public Documento(int numero, String remetente, String tipo) {
        this.numero = numero;
        this.remetente = remetente;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public String getRemetente() {
        return remetente;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract void exibir();

    @Override
    public String toString() {
        return "Numero: " + numero + " | Remetente: " + remetente + " | Tipo: " + tipo;
    }
}
