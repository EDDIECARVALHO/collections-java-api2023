package main.java.list.OperacoesBasicas.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    //Atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    //implementar os metodos
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    // metodo de remover uma tarefa
    public  void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<> ();
        for(Tarefa t: tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }

        }
        tarefaList.addAll(tarefasParaRemover);
    }
    //obter o numero total de tarefas
    public int obterNumeroTotaltarefas(){
        return  tarefaList.size();
    }
    //obter decriçao de todas tarefas na lista
    public  void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    public static void main(String[] args){
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotaltarefas());

        listaTarefa.adicionarTarefa( "Tarefa 1");
        listaTarefa.adicionarTarefa( "Tarefa 1");
        listaTarefa.adicionarTarefa( "Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotaltarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotaltarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
