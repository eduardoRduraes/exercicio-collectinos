package listas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private final List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        tarefas.add(tarefa);
        System.out.println("tarefa adicionada com sucesso. " + tarefas.getLast().getDescricao());
    }

    public void removerTarefa(String descricao) {
        if(tarefas.removeIf(T-> T.getDescricao().equals(descricao))){
            System.out.println("Tarefa removida com sucesso");
        }else{
            System.out.println("Tarefa nao encontrada!");
        }
    }

    public void obterNumeroTotalTarefas() {
        System.out.println("Numero total de tarefas: " + tarefas.size());
    }

    public void obterDescricoesTarefas() {
        tarefas.stream().forEach(t -> {
            System.out.println("listas.Tarefa numero: " + tarefas.indexOf(t) + " descricao: " + t.getDescricao());
        });
    }

}
