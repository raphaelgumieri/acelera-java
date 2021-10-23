package classes;

public class Retangulo {

    public double base;
    public double altura;

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return 2 * ( base + altura);
    }

    public double diagonal() {
        return Math.sqrt((2* base) + (2* altura));
    }

    public String toString() {
        return
                "Area: "
                + String.format("%.2f", area())
                + " Perimetro: "
                + String.format("%.2f", perimetro())
                + " Diagonal: "
                + String.format("%.2f", diagonal());
    }
}
