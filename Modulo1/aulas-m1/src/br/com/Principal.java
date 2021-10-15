package br.com; // toda classe em java deve estar dentro de um pacote. Pacote é pra estruturar

import br.com.variaveis.Primitivos;

public class Principal {
    public static void main(String[] args) { // psvm é o padrão p dar o ponto inicial da programação
        String nome="Raphael";
        System.out.println("Hello " + nome );
        Primitivos primitivos = new Primitivos();
        long longo = primitivos.longo;
        System.out.println(primitivos.longo);
    }
}
