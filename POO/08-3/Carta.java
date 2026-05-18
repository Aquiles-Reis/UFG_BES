/**
 * Produto concreto que representa uma carta formal criada pela fabrica.
 */
public class Carta extends Documento {
    private final String destinatario;
    private final String mensagem;

    public Carta(int numero, String remetente, String destinatario, String mensagem) {
        super(numero, remetente, "CARTA");
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    @Override
    public void exibir() {
        System.out.println("==============================");
        System.out.println("CARTA N\u00ba " + getNumero());
        System.out.println("De: " + getRemetente());
        System.out.println("Para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("==============================");
    }
}
