package main.java.set.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

    //atributos

    private Map<LocalDate, Evento> eventosMap;

    public void adicionarEvento(LocalDate data, String nome, String atracao){


       // Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
}

    public  void  exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public  void obterProximoEvento(){
       /* Set<LocalDate> dataSet = eventosMap.KeySet();
            Collection<Evento> values = eventosMap.values();*/
        // eventosMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual))  entry.getKey().isAfter(dataAtual);{
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + entry.getValue() + "acontecerá na data " + entry.getKey());
                break;
            }
          }

        }



   public  static  void  main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15 ), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JUNE, 9 ), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 15 ), "Evento 1", "Atração 1");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
   }
}