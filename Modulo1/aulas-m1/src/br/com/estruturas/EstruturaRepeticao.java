package br.com.estruturas;

public class EstruturaRepeticao {
    public void imprimirNumeros (int limite) {
        for (int i = 0; i < limite; i++) {
            System.out.println("O numero é: " + i);
        }
    }

    public void imprimirNumerosEnquanto (int numero) {
        while (numero < 100) {
            System.out.println("O numero é menor que 100, vamos dobrar!");
            numero *= 2;
        } System.out.println("O numero agora é " + numero);
    }

    public void imprimirNumeroDoWhile(int numero) {
        do {
            System.out.println("o numero é " + numero + " , vamos dobrar");
            numero *=2;
        } while(numero <100);
        System.out.println("o numero agora é: " + numero);
    }
}


