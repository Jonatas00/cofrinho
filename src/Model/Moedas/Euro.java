package Model.Moedas;

import Model.Moeda;

public class Euro extends Moeda {
  public Euro(double valor) {
    super(valor);
  }

  public double converter() {
    return valor * 6.38;
  }

  public void info() {
    System.out.println("Euro:" + valor);

  }

}
