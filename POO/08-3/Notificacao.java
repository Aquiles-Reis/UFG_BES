/**
 * Produto concreto que representa uma notificacao oficial criada pela fabrica.
 */
public class Notificacao extends Documento {
    private final String assunto;
    private final String conteudo;
    private final String dataEmissao;

    public Notificacao(int numero, String remetente, String assunto, String conteudo, String dataEmissao) {
        super(numero, remetente, "NOTIFICACAO");
        this.assunto = assunto;
        this.conteudo = conteudo;
        this.dataEmissao = dataEmissao;
    }

    @Override
    public void exibir() {
        System.out.println("==============================");
        System.out.println("NOTIFICA\u00c7\u00c3O N\u00ba " + getNumero());
        System.out.println("Emitida por: " + getRemetente());
        System.out.println("Assunto: " + assunto);
        System.out.println("Data: " + dataEmissao);
        System.out.println("Conte\u00fado: " + conteudo);
        System.out.println("==============================");
    }
}
