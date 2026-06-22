import java.io.*;
import java.util.ArrayList;

public class Agenda implements Serializable {

    private ArrayList<DataConsulta> datas;

    public Agenda() {
        datas = new ArrayList<>();
    }

    public void adicionarData(DataConsulta data){
        datas.add(data);
    }

    public void mostrarAgenda(){

        if(datas.isEmpty()){
            System.out.println("Agenda vazia");
            return;
        }

        for(DataConsulta d : datas){
            System.out.println(d);
        }
    }

    public void marcarConsulta(
            int dia,
            int mes,
            int ano,
            int hora,
            int minuto,
            Cliente cliente){

        DataConsulta dataEncontrada = null;

        for(DataConsulta d : datas){

            if(d.mesmaData(dia,mes,ano)){
                dataEncontrada = d;
                break;
            }
        }

        if(dataEncontrada == null){
            System.out.println("Data não encontrada");
            return;
        }

        Horario horarioEncontrado = null;

        for(Horario h :
                dataEncontrada.getHorarios()){

            if(h.getHora()==hora &&
                    h.getMinuto()==minuto){

                horarioEncontrado = h;
                break;
            }
        }

        if(horarioEncontrado == null){
            System.out.println("Horário não encontrado");
            return;
        }

        if(horarioEncontrado.disponivel()){

            horarioEncontrado.marcarCliente(cliente);

            System.out.println(
                    "Consulta marcada com sucesso!"
            );
        }
        else{
            System.out.println(
                    "Horário já ocupado"
            );
        }
    }

    public void salvarArquivo(){

        try{

            ObjectOutputStream arquivo =
                    new ObjectOutputStream(
                            new FileOutputStream(
                                    "agenda.dat"));

            arquivo.writeObject(this);

            arquivo.close();

            System.out.println(
                    "Agenda salva!"
            );

        }
        catch(Exception e){
            System.out.println(
                    "Erro: " + e.getMessage());
        }

    }
}