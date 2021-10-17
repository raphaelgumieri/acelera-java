package br.com.estruturas;

public class EstruturaCondicional {
  public void imprimirNome(String nome) {

    if(nome != null) {
      System.out.println(nome);
    } else {
      System.out.println("O nome é obrigatório");
    }
  }

  public void definirGrupoPorIdade(int idade) {
    if(idade < 12) {
      System.out.println("Grupo infantil");
    } else if(idade < 18) {
      System.out.println("Grupo juvenil");
    } else {
      System.out.println("Grupo adulto");
    }
  }

  public void selecionarFruta(String fruta) {
    switch (fruta) {
      case "Maçã" -> System.out.println("Maça");
      case "Laranja" -> System.out.println("Laranja");
      default -> System.out.println("Fruta nao disponível");
    }
  }

}
