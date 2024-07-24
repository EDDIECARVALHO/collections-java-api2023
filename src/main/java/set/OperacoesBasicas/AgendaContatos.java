package main.java.set.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public  void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public  Integer pesquisaPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.get(nome);

        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();


        agendaContatos.adicionarContato("Camila" , 123456);
        agendaContatos.adicionarContato("Camila" , 5665);
        agendaContatos.adicionarContato("Camila Cavalcante" , 1111111);
        agendaContatos.adicionarContato("Camila Dio" , 454987);
        agendaContatos.adicionarContato("Maria Silva" , 1111111);
        agendaContatos.adicionarContato("Camila" , 444444);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Maria Siva");
        agendaContatos.exibirContato();
    }
}

