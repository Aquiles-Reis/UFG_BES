import java.util.ArrayList;

/**
 * Classe principal responsavel por executar a aplicacao.
 */
public class Principal {
    public static void main(String[] args) {
        Empresa empresa = Empresa.getInstance();

        System.out.println("=== DADOS DA EMPRESA ===");
        System.out.println(empresa);

        ArrayList<Projeto> projetos = new ArrayList<>();
        projetos.add(new Projeto(
                1,
                "Sistema de RH",
                "Plataforma interna para gestao de funcionarios e folha de pagamento.",
                "01/03/2025",
                "01/09/2025",
                "EM ANDAMENTO",
                150000.00));
        projetos.add(new Projeto(
                2,
                "Portal do Cliente",
                "Ambiente web para acompanhamento de contratos, boletos e atendimentos.",
                "15/04/2025",
                "15/12/2025",
                "EM ANDAMENTO",
                230000.00));
        projetos.add(new Projeto(
                3,
                "Modernizacao de Infraestrutura",
                "Atualizacao dos servidores corporativos e melhoria da seguranca de rede.",
                "10/01/2025",
                "30/06/2025",
                "CONCLUIDO",
                98500.00));

        System.out.println();
        System.out.println("=== PROJETOS ===");
        for (int i = 0; i < projetos.size(); i++) {
            System.out.println("[Projeto " + (i + 1) + "]");
            System.out.println(projetos.get(i));
            System.out.println();
        }

        Empresa empresa1 = Empresa.getInstance();
        Empresa empresa2 = Empresa.getInstance();

        System.out.println("=== VERIFICA\u00c7\u00c3O SINGLETON ===");
        System.out.println("Singleton verificado: mesma inst\u00e2ncia? " + (empresa1 == empresa2));
    }
}
