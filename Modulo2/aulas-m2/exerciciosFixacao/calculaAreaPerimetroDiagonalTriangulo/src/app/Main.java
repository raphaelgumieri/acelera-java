package app;

import classes.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo;
        retangulo = new Retangulo();

        System.out.println("Inserir o valor da base: ");
        retangulo.base = sc.nextDouble();

        System.out.println("Inserir o valor da altura: ");
        retangulo.altura = sc.nextDouble();

        double area = retangulo.area();
        double perimetro = retangulo.perimetro();
        double diagonal = retangulo.diagonal();

        System.out.println(retangulo);

        sc.close();
    }
}
