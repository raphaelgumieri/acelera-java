package br.com.funcoes;

import java.util.ArrayList;
import java.util.List;

public class DesafioFibonacci {

  public static List<Integer> fibonacci() {
    List<Integer> fibonacciList = new ArrayList<>();

    int limit = 377;
    int x = 0;

    fibonacciList.add(0);
    fibonacciList.add(1);

    while (x < limit) {
      int ult = fibonacciList.size() - 1;
      int penult = fibonacciList.size() - 2;
      fibonacciList.add(fibonacciList.get(ult) + fibonacciList.get(penult));
      x=fibonacciList.get(ult);
    }

    fibonacciList.remove(fibonacciList.size() - 1);
    return fibonacciList ;
  }

  public static Boolean isFibonacci(Integer a) {
    return fibonacci().contains(a);
  }

}