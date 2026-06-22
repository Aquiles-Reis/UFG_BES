import java.io.Serializable;
import java.util.ArrayList;

public class DataConsulta implements Serializable {

    private int dia;
    private int mes;
    private int ano;

    private ArrayList<Horario> horarios;

    public DataConsulta(int dia, int mes, int ano,
                         int horaInicial,
                         int minutoInicial,
                         int quantidade) {

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        horarios = new ArrayList<>();

        int hora = horaInicial;
        int minuto = minutoInicial;

        for(int i=0;i<quantidade;i++){

            horarios.add(new Horario(hora,minuto));

            minuto += 30;

            if(minuto >= 60){
                minuto = 0;
                hora++;
            }
        }
    }

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }

    public boolean mesmaData(int d,int m,int a){
        return dia==d && mes==m && ano==a;
    }

    @Override
    public String toString(){

        String texto = "\nAgenda do dia "
                + dia + "/" + mes + "/" + ano + "\n";

        for(Horario h : horarios){
            texto += h + "\n";
        }

        return texto;
    }
}