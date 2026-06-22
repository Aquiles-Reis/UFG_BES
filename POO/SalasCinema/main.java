import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<SalaCinema> salas = new ArrayList<>();

        String continuarSalas;

        do {

            System.out.println("\n=== CADASTRO DE SALA ===");

            System.out.print("Número da sala: ");
            int numero = entrada.nextInt();
            entrada.nextLine();

            System.out.print("Nome da sala: ");
            String nomeSala = entrada.nextLine();

            System.out.print("Localização: ");
            String localizacao = entrada.nextLine();

            SalaCinema sala =
                    new SalaCinema(numero, nomeSala, localizacao);

            String continuarFilmes;

            do {

                System.out.println("\n--- CADASTRO DE FILME ---");

                System.out.print("Nome: ");
                String nomeFilme = entrada.nextLine();

                System.out.print("Ano: ");
                int ano = entrada.nextInt();
                entrada.nextLine();

                System.out.print("País de origem: ");
                String pais = entrada.nextLine();

                System.out.print("Língua: ");
                String lingua = entrada.nextLine();

                System.out.print("Tipo: ");
                String tipo = entrada.nextLine();

                Filme filme =
                        new Filme(nomeFilme, ano,
                                   pais, lingua, tipo);

                String continuarArtistas;

                do {

                    System.out.println("\nCadastro de artista");

                    System.out.print("Nome: ");
                    String nomeArtista = entrada.nextLine();

                    System.out.print("Idade: ");
                    int idade = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Nacionalidade: ");
                    String nacionalidade =
                            entrada.nextLine();

                    Artista artista =
                            new Artista(nomeArtista,
                                         idade,
                                         nacionalidade);

                    filme.adicionarArtista(artista);

                    System.out.print(
                            "Adicionar outro artista? (s/n): ");

                    continuarArtistas =
                            entrada.nextLine();

                } while
                (continuarArtistas.equalsIgnoreCase("s"));

                sala.adicionarFilme(filme);

                System.out.print(
                        "Adicionar outro filme? (s/n): ");

                continuarFilmes =
                        entrada.nextLine();

            } while
            (continuarFilmes.equalsIgnoreCase("s"));

            salas.add(sala);

            System.out.print(
                    "Adicionar outra sala? (s/n): ");

            continuarSalas =
                    entrada.nextLine();

        } while
        (continuarSalas.equalsIgnoreCase("s"));

        try {

            PrintWriter escritor =
                    new PrintWriter(
                            new FileWriter("cinema.txt"));

            for (SalaCinema sala : salas) {

                escritor.println(sala);
                escritor.println(
                        "================================");
            }

            escritor.close();

            System.out.println(
                    "\nDados gravados com sucesso!");

        } catch (IOException e) {

            System.out.println(
                    "Erro ao gravar arquivo.");
        }

        entrada.close();
    }
}