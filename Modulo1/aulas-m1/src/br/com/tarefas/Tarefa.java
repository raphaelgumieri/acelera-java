package br.com.tarefas;

public class Tarefa {
    String descricao;

    public Tarefa(String descricao){ // é o construtor, onde vc declara os parametros
        this.descricao = descricao; // o this é usado para se referir a variavel global
    }
   public void exibirTarefa(){
        System.out.println(descricao);
    }
    
    public int obterTamanhoTarefa() {
        return descricao.length();
    }
}
