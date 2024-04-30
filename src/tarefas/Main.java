package listas;

import listas.ListaTarefas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaTarefas lista = new ListaTarefas();
        do {
            System.out.println("Selecione 1-add\t2-remover\t3-totalDeTarefas\t4-obterDesricoesTarefas");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Adicione uma tarefa");
                    String adicinarDecricao = scanner.nextLine();
                    lista.adicionarTarefa(adicinarDecricao);
                    break;
                case 2:
                    System.out.println("remova uma tarefa");
                    String removerTarefa = scanner.nextLine();
                    lista.removerTarefa(removerTarefa);
                    break;
                case 3:
                    lista.obterNumeroTotalTarefas();
                    break;
                case 4:
                    lista.obterDescricoesTarefas();
                    break;
                default:
                    return;
            }
        }while (true);
    }
}