package br.com.tarefas;
import java.util.ArrayList;

public class ListaTarefas {

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionar(Tarefa tarefa){
        if (tarefa != null && tarefa.obterTamanhoTarefa() <= 20) {
            this.tarefas.add(tarefa);
        } else {
            System.out.println("A tarefa é inválida");
        }
    };

    public void remover (int posicao) {
        if(posicao < this.tarefas.size()) {
            this.tarefas.remove(posicao);
        } else {
            System.out.println("a tarefa nao existe  ");
        }
    }

    public void removerComRemove(Tarefa tarefa) {
        this.tarefas.remove(tarefa); // com o remove, não dá erro na hora de remover o item de dentro do array caso ele n exista;
    }

    public void exibirTarefas() {
        for (Tarefa tarefa: tarefas) {
            tarefa.exibirTarefa();
        }
    }

    public Tarefa buscar(String descricao) {
        for(Tarefa tarefa: tarefas) {
            if(descricao.equals(tarefa.descricao)) {
                return tarefa;
            }
        }
        System.out.println("Tarefa nao encontrada");
        return null;
    }

    public void adicionar(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        adicionar(tarefa);
    }
}
