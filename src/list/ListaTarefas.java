package src.list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    // ATRIBUTO

    private List<Tarefa> tarefalist;

    // CONSTRUTOR

    public ListaTarefas() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasARemover = new ArrayList<>();
        for (Tarefa tarefa : this.tarefalist) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasARemover.add(tarefa);
            }
        }
        tarefalist.removeAll(tarefasARemover);
    }

    public int obterNumeroTotalTarefas() {
        return this.tarefalist.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar Python");
        listaTarefas.adicionarTarefa("Estudar JavaScript");
        listaTarefas.adicionarTarefa("Estudar C++");
        listaTarefas.adicionarTarefa("Estudar C#");

        listaTarefas.obterNumeroTotalTarefas();

    }

}
