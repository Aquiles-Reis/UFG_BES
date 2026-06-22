public import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Agenda agenda = new Agenda();

        int opcao;

        do{

            System.out.println("\n1-Criar agenda");
            System.out.println("2-Mostrar agenda");
            System.out.println("3-Marcar consulta");
            System.out.println("0-Sair");

            opcao = sc.nextInt();

            switch(opcao){

                case 1:

                    System.out.print("Dia: ");
                    int dia=sc.nextInt();

                    System.out.print("Mes: ");
                    int mes=sc.nextInt();

                    System.out.print("Ano: ");
                    int ano=sc.nextInt();

                    System.out.print("Hora inicial: ");
                    int hora=sc.nextInt();

                    System.out.print("Min inicial: ");
                    int min=sc.nextInt();

                    System.out.print("Quantidade: ");
                    int qtd=sc.nextInt();

                    DataConsulta data =
                            new DataConsulta(
                                    dia,
                                    mes,
                                    ano,
                                    hora,
                                    min,
                                    qtd
                            );

                    agenda.adicionarData(data);

                    System.out.println(
                            "Agenda criada!"
                    );

                    break;


                case 2:

                    agenda.mostrarAgenda();

                    break;


                case 3:

                    System.out.print("Dia:");
                    dia=sc.nextInt();

                    System.out.print("Mes:");
                    mes=sc.nextInt();

                    System.out.print("Ano:");
                    ano=sc.nextInt();

                    System.out.print("Hora:");
                    hora=sc.nextInt();

                    System.out.print("Minuto:");
                    min=sc.nextInt();

                    sc.nextLine();

                    System.out.print(
                            "Nome cliente:"
                    );

                    String nome =
                            sc.nextLine();

                    Cliente cliente =
                            new Cliente(nome);

                    agenda.marcarConsulta(
                            dia,
                            mes,
                            ano,
                            hora,
                            min,
                            cliente
                    );

                    break;


                case 0:

                    agenda.salvarArquivo();

                    System.out.println(
                            "Encerrando..."
                    );

                    break;

            }

        }while(opcao!=0);

        sc.close();

    }
} {

import POO.agenda.Agenda;
import POO.agenda.DataConsulta;
    
}
