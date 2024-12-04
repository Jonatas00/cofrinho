package Model.Moedas;

import Model.Moeda;

public class Dolar extends Moeda {
  public Dolar(double valor) {
    super(valor);
  }

  public double converter() {
    return valor * 6.07;
  }

  public void info() {
    System.out.println("Dolar:" + valor);
  }
}
