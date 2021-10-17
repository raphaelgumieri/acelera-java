package br.com; // toda classe em java deve estar dentro de um pacote. Pacote é pra estruturar

import br.com.estruturas.EstruturaRepeticao;
import br.com.tarefas.ArrayTarefas;
import br.com.tarefas.ListaTarefas;
import br.com.tarefas.Tarefa;
import br.com.variaveis.Primitivos;

public class Principal {
    public static void main(String[] args) { // psvm é o padrão p dar o ponto inicial da programação
        String nome="Raphael";
        System.out.println("Hello " + nome );
        Primitivos primitivos = new Primitivos();
        long longo = primitivos.longo;
        System.out.println(primitivos.longo);

//        System.out.println("Minhas tarefas");
        Tarefa tarefa1 = new Tarefa("Regar as plantas logo depois da hora do jantar"); // chamo a classe tarefa, atribuo um nome p ela, e crio uma nova Tarefa passando como parametro o que eu quero criar
//        tarefa1.exibirTarefa();
//        System.out.println("a tarefa tem " + tarefa1.obterTamanhoTarefa() + " caracteres");

        Tarefa tarefa2 = new Tarefa("estudar");
        Tarefa tarefa3 = new Tarefa("travalhar");

        ListaTarefas tarefas = new ListaTarefas();
        //tarefas.adicionar(tarefa1);
        tarefas.adicionar(tarefa2);
        tarefas.adicionar(tarefa3);
        System.out.println("----------------");
        tarefas.exibirTarefas();

        Tarefa variavel = tarefas.buscar("estudar");
        variavel.exibirTarefa();

//        System.out.println("----------------");
//        EstruturaRepeticao r = new EstruturaRepeticao();
//        r.imprimirNumeros(10);
//        r.imprimirNumerosEnquanto(20);

    }
}
