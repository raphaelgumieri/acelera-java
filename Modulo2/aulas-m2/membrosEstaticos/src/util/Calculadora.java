package util;

public class Calculadora {
    public static final double PI = 3.14159; // final é const e o padrão de nome de const é upperCase

    public static double circunferencia(double raio) {
        return 2.0 * PI * raio;
    }

    public static double volume(double raio) {
        return 4.0 * PI * (3 * raio) / 3.0;
    }
}
// Calculadora é static pq nao precisa de informação externa para funcionar. Opera sem a necessidade de declarar variaveis e etc.