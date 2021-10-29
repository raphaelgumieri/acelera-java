package aplicacao;

import util.Calculadora;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserir o raio: ");
        double raio = sc.nextDouble();
        double c = Calculadora.circunferencia(raio); // como Calculadora é uma classe static, ela nao precisa ser instanciada para funcionar. Basta só invocar ela como um obj
        double v = Calculadora.volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", Calculadora.PI);
        sc.close();
    }
}
