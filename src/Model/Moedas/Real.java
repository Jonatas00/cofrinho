package Model.Moedas;

import Model.Moeda;

public class Real extends Moeda {
  public Real(double valor) {
    super(valor);
  }

  public double converter() {
    return valor;
  }

  public void info() {
    System.out.println("Real: " + valor);
  }
}
