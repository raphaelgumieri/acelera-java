package br.com.codenation.calculadora;

public class CalculadoraSalario {
    public long calcularSalarioLiquido(double salarioBase) {
        double salarioInss = calcularInss(salarioBase);
        double salarioIrrf = calcularIrrf(salarioInss);
        return Math.round(salarioIrrf);
    }

    private double calcularInss(double salarioBase) {
      double salarioMenosIss = salarioBase;
      if (salarioBase < 1039.00) {
          salarioMenosIss = 0;
      } else if (salarioBase >= 1039 && salarioBase <= 1500) {
          salarioMenosIss = salarioBase - salarioBase * 0.08;
      } else if(salarioBase > 1500 && salarioBase <= 4000) {
          salarioMenosIss = salarioBase - salarioBase * 0.09;
      } else {
          salarioMenosIss = salarioBase - salarioBase * 0.11;
      }
      return salarioMenosIss;
    }

    private double calcularIrrf(double salarioMenosInss) {
        double salarioMenosIrrf = salarioMenosInss;
        if (salarioMenosInss > 3000 && salarioMenosInss <= 6000) {
            salarioMenosIrrf = salarioMenosInss - salarioMenosInss * 0.075;
        } else if (salarioMenosInss > 6000){
            salarioMenosIrrf = salarioMenosInss - salarioMenosInss * 0.15;
        }
        return salarioMenosIrrf;
    }
}
